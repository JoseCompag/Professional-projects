package assignment6_exercises.fuzzing;

import java.util.ArrayList;
import java.util.Random;


public class MutationFuzzer implements Fuzzer{
	
	private ArrayList<String> population;
	private int min_mutations; 
	private int max_mutations;
	
	/**
	 * @param seeds is a list of (input) strings to mutate
	 * @param min_mutations is the minimum number of mutations to apply
	 * @param max_mutations is the maximum number of mutations to apply
	 */
	public MutationFuzzer(ArrayList<String> seeds, int min_mutations, int max_mutations ) {
		this.population = seeds;
		this.min_mutations = min_mutations; 
		this.max_mutations = min_mutations;
	
	}
	
	/**
     * Applies a random number of mutations to a randomly selected string from the population.
     * @return a mutated string from the population
     */
	public String fuzz() {
		if (population == null) {
			throw new IllegalArgumentException("Population is null");
		}
		if (population.isEmpty()) {
			return "";
		}

		Random random = new Random();
		int indexOfStringToMutate = random.nextInt(population.size());
		int randomNumMutations = min_mutations + random.nextInt(max_mutations - min_mutations + 1);
		
		String mutatedString = population.get(indexOfStringToMutate);
		for (int i = 0; i < randomNumMutations; i++) {
			mutatedString = Mutator.mutate(mutatedString);
		}

		return mutatedString;
	}
}