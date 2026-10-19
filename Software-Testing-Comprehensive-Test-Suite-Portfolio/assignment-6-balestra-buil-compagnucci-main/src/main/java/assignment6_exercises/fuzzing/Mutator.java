package assignment6_exercises.fuzzing;

import java.util.Random;

/**
 * 
 * Implements mutations operator on String
 *
 */
public class Mutator {
	
	/**
	 * Deletes a random character from the given string.
	 * 
	 * This method randomly selects a character from the input string and removes it,
	 * returning a new string with the character deleted. If the input string is empty, 
	 * the method returns it unchanged.
	 *
	 * @param s the input string from which a random character will be deleted
	 * @return a new string with one random character removed
	 *
	 * @throws IllegalArgumentException if the input string is null
	 *
	 */
	private static String deleteRandomCharacter(String s) {
        if (s == null) {
			throw new IllegalArgumentException("Input string is null.");
		}

		if (s.isEmpty()) {
			return s;
		}

		Random random = new Random();
		int indexToDelete = random.nextInt(s.length());

        return s.substring(0, indexToDelete) + s.substring(indexToDelete + 1);
    }	
	
	/**
	 * Inserts a random ASCII character into a random position within the given string. 
	 * The random position could be at any index from 0 to the length of the string, allowing insertion at the end as well.
	 *
	 * @param s the input string into which a random character will be inserted
	 * @return a new string with the random character inserted at a random position in the input string
	 *
	 * @throws IllegalArgumentException if the input string is null
	 */
	private static String insertRandomCharacter(String s) {
        if (s == null) {
			throw new IllegalArgumentException("Input string is null");
		}

		Random random = new Random();
		int indexToAddNewChar = random.nextInt(s.length() + 1);
		char randomChar = (char) (32 + random.nextInt(95)); 

		return s.substring(0, indexToAddNewChar) + randomChar + s.substring(indexToAddNewChar);
    }
	
	/**
	 * Flips a random bit in a randomly selected character of the given string.
	 * 
	 * This method randomly selects a character in the input string, and then flips 
	 * a random bit. 
	 *
	 * @param s the input string from which a character will be randomly selected and modified.
	 * @return a new string where a single character has been modified by flipping a random bit;
	 * @throws IllegalArgumentException if the input string is null.
	 */
	private static String flipRandomCharacter(String s) {
        if (s == null) {
			throw new IllegalArgumentException("Input string is null");
		}
		if (s.isEmpty()) {
			return s;
		}

		Random random = new Random();
		int indexToFlip = random.nextInt(s.length());
        char c = s.charAt(indexToFlip);

        int bitToFlip = 1 << random.nextInt(8);  // Random bit to flip (0-7)
        char flippedChar = (char) (c ^ bitToFlip);  // XOR the bit to flip it
        
        return s.substring(0, indexToFlip) + flippedChar + s.substring(indexToFlip + 1);
    }
	
	
	/**
	 * Mutates the given string by randomly choosing one of three operations: 
	 * deleting a random character, inserting a random character, or flipping a random bit 
	 * in one of the string's characters. The operation is selected based on a random number.
	 
	 * @param s the input string to mutate
	 * @return a new string that has been mutated based on a random operation
	 * @throws IllegalArgumentException if the input string is null
	 */
	public static String mutate(String s) {
		if (s == null) {
			throw new IllegalArgumentException("Input string is null");
		}

		Random random = new Random();
		int randomMutation = random.nextInt(3);
		String mutatedString;

		if (randomMutation == 0) 
			mutatedString = deleteRandomCharacter(s);
		else if (randomMutation == 1) 
			mutatedString = insertRandomCharacter(s);
		else 
			mutatedString = flipRandomCharacter(s);

		return mutatedString;
	}		 
}