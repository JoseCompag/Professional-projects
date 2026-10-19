package assignment4_exercises.fmt_rewrap;

import assignment4_exercises.fmt_rewrap.csv_handler.CsvHandler;
import assignment4_exercises.fmt_rewrap.testrequirementchecker.TestRequirementChecker;

import java.util.List;

public class EdgeCoverageTestValidator {
    public static void main(String[] args) {
        String pathsFilePath = "src/main/java/assignment4_exercises/fmt_rewrap/csv_files/testsPathsForEdgeCoverage.csv";
        String requirementsFilePath = "src/main/java/assignment4_exercises/fmt_rewrap/csv_files/testsRequirementsForPrimePathCoverage.csv";
        String outputFilePath = "src/main/java/assignment4_exercises/fmt_rewrap/csv_files/unmetTestRequirements.csv";

        List<List<String>> pathsRecords = CsvHandler.getCsvContent(pathsFilePath);
        List<List<String>> testRequirementsRecords = CsvHandler.getCsvContent(requirementsFilePath);

        TestRequirementChecker checker = new TestRequirementChecker();
        List<List<String>> unmetRequirements = checker.findUnmetTestRequirements(pathsRecords, testRequirementsRecords);

        CsvHandler.writeCsvContent(outputFilePath, unmetRequirements);
    }
}