package assignment9_exercises;

import java.util.Random;

/**
 * 
 * Partially implemented ThreesTile Class for Threes game
 * 
 */

public class ThreesTile {

	private int value;

	public ThreesTile() {
		// Tile should be unset
		value = 0;
	}

	public ThreesTile(int v) {
		if (isValidValue(v))
			value = v;
		else
			throw new IllegalArgumentException("The value should be value is either 1, 2 or 3 * 2^i.");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int v) {
		if (isValidValue(v))
			value = v;
		else
			throw new IllegalArgumentException("The value should be value is either 1, 2 or 3 * 2^i. Value: " + v);
	}

	public void clear() {
		value = 0;
	}

	public void setRandomValue() {
		Random randomGenerator = new Random();
		randomGenerator.setSeed(System.currentTimeMillis());
		int randomInt = randomGenerator.nextInt() % 3;
		value = randomInt + 1;
	}

	/**
	 * Checks if a given value is valid according to the game rules.
	 * 
	 * @param v the value to check
	 * @return Returns true iff value is either 1, 2 or 3 * 2^i
	 */
	public boolean isValidValue(int v) {
		if (v == 0)
			return true;
		if (v == 1 || v == 2)
			return true;
		int current = 3;
		while (current <= v) {
			if (current == v) {
				return true;
			}
			current *= 2;
		}
		return false;
	}

	/**
	 * 
	 * @return true iff the tile is free, false otherwise
	 */
	public boolean isFree() {
		return (value == 0);
	}

	/**
	 * Provides a string representation of the tile (shows its value as a string)
	 */
	public String toString() {
		return Integer.toString(value);
	}

	public ThreesTile combineTile(ThreesTile t) {
		int v2 = t.getValue();
		if (isValidValue(v2))
			return new ThreesTile(value + v2);
		else
			throw new IllegalArgumentException();
	}
}