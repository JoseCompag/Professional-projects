package assignment6_exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PalindromeTests {
    
	@Test
	public void testCapicua() {
		char [] a ={'n','e','u','q','u','e','n'};
		boolean b  = Palindrome.capicua(a);
		assertTrue(b);
	}

	@Test
	public void testCapicua2() {
		char [] a ={'c','o','r','d','o','b','a'};
		boolean b  = Palindrome.capicua(a);
		assertFalse(b);
	}
}


