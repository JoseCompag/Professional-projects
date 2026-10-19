package assignment8_exercises.fail2ban;

import randoop.CheckRep;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.io.Serializable;

/**
 * Class SinglyLinkedList defines Singly linked List
 * 
 * @author
 */
public class SinglyLinkedList implements Serializable {

	public static final long serialVersionUID = 1;

	Entry header;
	int size = 0;

	public SinglyLinkedList() {
		header = new Entry();
		size = 0;
	}

	public IP get(int index) {
		Entry current = header.next;
		int i = 0;
		while (current != null && i < index) {
			current = current.next;
			i++;
		}
		if (current != null) {
			return current.element;
		}
		return null;
	}

	public boolean contains(IP ip) {
		Entry current = header.next;
		while (current != null) {
			if (current.element.equals(ip))
				return true;
			current = current.next;
		}
		return false;
	}

	// add the new IP at the first position.
	public void add(IP ip) {
		Entry n = new Entry();
		n.element = new IP(ip.getFirst(), ip.getSecond(), ip.getThird(), ip.getFourth());
		Entry nn = header.next;
		n.next = nn;
		header.next = n;
		size++;
	}

	/**
	 * This method removes a given IP iff it belongs to the current list.
	 */
	public boolean remove(IP value) {
		if (!contains(value))
			return false;

		Entry current = header.next.next;
		Entry prev = header.next;
		while (current != null) {
			if (current.element.equals(value)) {
				// remove ip
				prev.next = current.next;
				break;
			}
			current = current.next;
			prev = prev.next;
		}
		return true;
	}

	/**
	 * RepOk checks whether the singlyLinkedList satisfies
	 * its representation invariant
	 * 
	 * @return True iff the current list satisfies its
	 *         representation invariant
	 */
	@CheckRep
	public boolean repOK() {
		// TODO: preguntar
		if (header==null) {
			return false;
		}
		if (isEmpty()) {
			return true;
		}

		// almacena IPs de manera no repetida
		List<IP> aux = new LinkedList<>();
		Entry current = header.next;

		while (current != null) {
			IP currentIP = current.element;
			if (aux.contains(currentIP)) {
				return false;
			}
			aux.add(currentIP);
			current = current.next;
		}

		return true;
		// if (Objects.isNull(header)) {
		// return false;
		// }
		// if (isEmpty()) {
		// return true;
		// }
		// return noReps();
	}

	public int getSize() {
		return size;
	}

	/**
	 * Checks whether or not the current list has not elements.
	 * 
	 * @return true iff the current list is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return header.next == null;
	}

	/**
	 * Checks whether or not the current list has not repeated elements.
	 * 
	 * @return true iff all the elements in the list are different each other.
	 */
	public boolean noReps() {
		if (!isEmpty()) {
			Set<IP> visited = new java.util.HashSet<IP>();
			for (Entry current = header.next; current != null; current = current.next) {
				if (!visited.add(current.element)) {
					return false;
				}
			}
		}
		return true;
	}

	public HashSet<IP> toSet() {
		HashSet<IP> ipSet = new java.util.HashSet<IP>();
		for (Entry current = header.next; current != null; current = current.next) {
			ipSet.add(current.element);

		}
		return ipSet;

	}

	public String toString() {
		String res = "(";
		if (header != null) {
			Entry cur = header.next;
			while (cur != null && cur != header) {
				res += cur.toString();
				cur = cur.next;
			}
		}
		return res + ")";
	}

}// End Class
