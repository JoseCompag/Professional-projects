package assignment4_exercises.fmt_rewrap;

import assignment4_exercises.Path;
import assignment4_exercises.fmt_rewrap.csv_handler.CsvHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The BestEffortTouringTestDrive class is used to verify the coverage of test requirements
 * using the "Best Effort Touring" criterion. This class reads test requirements from a CSV file,
 * obtains the prime paths, and calculates the number of uncovered test requirements.
 */
public class BestEffortTouringTestDrive {
    public static void main(String[] args) {
        String requirementsFilePath = "src/main/java/assignment4_exercises/fmt_rewrap/csv_files/testsRequirementsForPrimePathCoverage.csv";
        List<List<String>> testRequirementsRecords = CsvHandler.getCsvContent(requirementsFilePath);

        List<List<Integer>> primePathsTestRequirements = getPrimePathsTestRequirements(testRequirementsRecords);
        List<Path> primePaths = getPaths();

        int uncoveredCount = getUncoveredCount(primePathsTestRequirements, primePaths);

        System.out.println("Number of uncovered test requirements: " + uncoveredCount);
    }

    /**
     * Calculates the number of uncovered test requirements.
     *
     * @param primePathsTestRequirements List of prime path test requirements.
     * @param primePaths List of prime paths.
     * @return The number of uncovered test requirements.
     */
    private static int getUncoveredCount(List<List<Integer>> primePathsTestRequirements, List<Path> primePaths) {
        int uncoveredCount = 0;
        for (List<Integer> testRequirement : primePathsTestRequirements) {
            boolean isCovered = false;
            for (Path path : primePaths) {
                if (path.isSublist(testRequirement)) {
                    isCovered = true;
                    break;
                }
            }
            if (!isCovered) {
                uncoveredCount++;
            }
        }
        return uncoveredCount;
    }

    /**
     * Converts the test requirement records into a list of lists of integers.
     *
     * @param testRequirementsRecords Test requirement records read from the CSV file.
     * @return List of lists of integers representing the prime path test requirements.
     */
    private static List<List<Integer>> getPrimePathsTestRequirements(List<List<String>> testRequirementsRecords) {
        List<List<Integer>> primePathsTestRequirements = new ArrayList<>();
        for (List<String> record : testRequirementsRecords) {
            List<Integer> testRequirement = record.stream().map(Integer::parseInt).collect(Collectors.toList());
            primePathsTestRequirements.add(testRequirement);
        }
        return primePathsTestRequirements;
    }

    /**
     * Obtains the prime paths from a list of strings and a list of integers.
     *
     * @return List of Path objects representing the prime paths.
     */
    private static List<Path> getPaths() {
        List<Path> primePaths = new ArrayList<>();
        List<String> strings = Arrays.asList("This", "This is", "\nThis is", "\n\nThis is", "Este es un ejemplo de string largo");
        List<Integer> integers = Arrays.asList(0, 0, 0, 0, 20);

        for (int i = 0; i < strings.size(); i++) {
            primePaths.add(FmtRewrap.getPathForRewrappedString(strings.get(i), integers.get(i)));
        }
        return primePaths;
    }
}