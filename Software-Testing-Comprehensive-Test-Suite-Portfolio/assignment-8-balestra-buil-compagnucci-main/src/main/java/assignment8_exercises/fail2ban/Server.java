package assignment8_exercises.fail2ban;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import randoop.CheckRep;

/**
 * This class represents a server which accepts connections and manages bans an
 * exceptions
 * 
 * @author
 * @author
 * @version 0.1
 */

public class Server implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long expirationTime = new Long(60000);

	private Long lastUpdate;

	/**
	 * A set of exceptions
	 */
	private SinglyLinkedList exceptions;

	/**
	 * A list of bans
	 */
	private StrictlySortedSinglyLinkedList bans;

	/**
	 * It returns the current system time
	 */
	private ITime time;

	public void setTime(ITime time) {
		if (time == null) {
			throw new IllegalArgumentException("Time cannot be null");
		}

		this.time = time;
	}

	/**
	 * Creates a new server
	 */
	public Server() {
		this.exceptions = new SinglyLinkedList();
		this.bans = new StrictlySortedSinglyLinkedList();
		this.time = new RealTime();
	}

	/**
	 * Accepts a new connection.
	 * If there's a ban for the connecting IP and the ban is not yet due then the
	 * connection will be refused.
	 * It returns true iff the connection was accepted.
	 */
	public boolean connect(IP ip) {
		if (bans.containsIP(ip))
			return false;
		else
			return true;
	}

	/**
	 * Add a new exception.
	 * If there's a ban for the exception's IP then the ban will be removed.
	 * It returns true iff the exception was successfully added.
	 */
	public boolean addException(IP ip) {
		if (ip == null) {
			throw new IllegalArgumentException("IP cannot be null");
		}
		if (exceptions.contains(ip)) {
			return false;
		} else {
			bans.removeFromIP(ip);
			exceptions.add(ip);
			return true;
		}
	}

	/**
	 * Remove IP from exception list.
	 * It returns true iff the IP was removed from the exception list.
	 */
	public boolean removeException(IP ip) {
		return exceptions.remove(ip);
	}

	/**
	 * Adds a new ban iff a ban for the same IP doesn't exist and there's not an
	 * exception for the bans IP
	 * returns true iff the ban was successfully added
	 */
	public boolean addBan(IP ban) {
		if (ban == null) {
			throw new IllegalArgumentException("ban cannot be null");
		}
		// no repeated
		if (bans.containsIP(ban)) {
			return false;
		}

		// banned IP's cannot be in the exceptions list
		if (exceptions.contains(ban))
			return false;

		// create new banned IP with the currentTime plus the expirationTime constant.
		IPBan ipban = new IPBan(ban, time.getCurrentTime() + expirationTime);
		bans.add(ipban);
		return true;
	}

	/**
	 * Removes the IP from the bans list
	 */
	public boolean removeBan(IP ban) {
		// no repeated
		if (!bans.containsIP(ban)) {
			return false;
		}

		// remove the banned IP's from bans list
		bans.removeFromIP(ban);

		return true;
	}

	/**
	 * Update the banned list and the lastUpdate time
	 * 
	 * @return
	 */
	public void update() {

		lastUpdate = time.getCurrentTime();

		IPBan b;
		while (bans.getSize() > 0 && (b = bans.get(0)).getExpires().compareTo(lastUpdate) <= 0) {
			bans.removeFromIP(b.ip);
		}

	}

	@CheckRep
	public boolean repOK() {
		if (exceptions == null || bans == null) {
			return false;
		}
		if (!bans.repOK() || !exceptions.repOK()) {
			return false;
		}

		List<IPBan> elementsInBans = new LinkedList<>();

		if (bans.getSize() != 0) {
			IPBan current;

			for (int i = 0; i < bans.getSize(); i++) {
				current = bans.get(i);

				// ningún IP banneado puede tener un tiempo de expiración menor a lastupdate.
				if (lastUpdate != null && current.getExpires() < lastUpdate) {
					return false;
				}
				elementsInBans.add(current);
			}
		}

		List<IP> elementsInExceptions = new LinkedList<>();
		for (int i = 0; i < exceptions.getSize(); i++) {
			IP current = exceptions.get(i);
			elementsInExceptions.add(current);
		}

		// exceptions y bans no comparten elementos, es decir, no es posible encontrar
		// un IP prohibido que pertenezca al conjunto de IP confiables.
		for (IPBan currentBannedIP : elementsInBans) {
			if (!elementsInExceptions.isEmpty() && elementsInExceptions.contains(currentBannedIP.getIp())) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		return "Server [lastUpdate=" + lastUpdate + ", exceptions=" + exceptions.toString() + ", bans="
				+ bans.toString() + "]";
	}
}