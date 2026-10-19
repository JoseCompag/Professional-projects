package assignment3_exercises;

import java.util.HashSet;
import java.util.Set;
public class SetUtils{
	
	/**
	 * Computes the intersection of two sets of integers.
	 *
	 * <p>This method returns a new set containing only the elements that are present
	 * in both of the input sets. The input sets themselves are not modified.</p>
	 *
	 * @param set1 the first set of integers
	 * @param set2 the second set of integers
	 * @return a new set containing the intersection of {@code set1} and {@code set2}
	 *         (i.e., the elements that are common to both sets)
	 * @throws NullPointerException if either {@code set1} or {@code set2} is {@code null}
	 */
    public static  Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
		if (set1 == null || set2 == null)
			throw new NullPointerException("Some of sets is null.");
		if (set1.isEmpty() && !set2.isEmpty())
			return set2;
		if (set2.isEmpty() && !set1.isEmpty())
			return set1;
		Set<Integer> result = new HashSet<>();
		for (Integer i : set2) {
			if (set1.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}

   	
}
