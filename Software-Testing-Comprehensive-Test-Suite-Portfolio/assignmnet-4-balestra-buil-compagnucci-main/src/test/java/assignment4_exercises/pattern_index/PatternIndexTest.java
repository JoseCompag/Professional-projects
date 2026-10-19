package assignment4_exercises.pattern_index;

import assignment4_exercises.pattern_index.PatternIndex;
import assignment4_exercises.fmt_rewrap.csv_handler.CsvHandler;
import assignment4_exercises.fmt_rewrap.testrequirementchecker.TestRequirementChecker;
import assignment4_exercises.Path;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class PatternIndexTest {

  private static final List<List<String>> pathsRecords = new ArrayList<>();

  @AfterAll
  public static void tearDown() {
    String requirementsFilePathPPC = "src/main/java/assignment4_exercises/pattern_index/csv_files/testsRequirementsForPrimePathCoverage_PatternIndex.csv";
    String outputFilePathPPC = "src/main/java/assignment4_exercises/pattern_index/csv_files/unmetTestRequirements_PPC.csv";
    List<List<String>> testRequirementsRecords = CsvHandler.getCsvContent(requirementsFilePathPPC);
    TestRequirementChecker checker = new TestRequirementChecker();

    List<List<String>> unmetRequirements = checker.findUnmetTestRequirements(pathsRecords, testRequirementsRecords);

    //There are 31 testing requirements.
    CsvHandler.writeCsvContent(outputFilePathPPC, unmetRequirements, 31);

    String requirementsFilePathEC = "src/main/java/assignment4_exercises/pattern_index/csv_files/testsRequirementsForEdgePathCoverage_PatternIndex.csv";
    String outputFilePathEC = "src/main/java/assignment4_exercises/pattern_index/csv_files/unmetTestRequirements_EC.csv";
    testRequirementsRecords = CsvHandler.getCsvContent(requirementsFilePathEC);

    unmetRequirements = checker.findUnmetTestRequirements(pathsRecords, testRequirementsRecords);

    //There are 14 testing requirements.
    CsvHandler.writeCsvContent(outputFilePathEC, unmetRequirements, 14);
  }

  private static Stream<Arguments> patternsProviders() {
    return Stream.of(
      // Test path covered: [1, 2, 3, 11]
      Arguments.of("a", "bc", -1),
      // Test path covered: [1, 2, 3, 4, 5, 6, 10, 3, 11]
      Arguments.of("ab", "a", 0),
      // Test path covered: [1, 2, 3, 4, 5, 6, 7, 9, 6, 10, 3, 11]
      Arguments.of("ab", "ab", 0),
      // Test path covered: [1, 2, 3, 4, 5, 6, 7, 8, 10, 3, 11]
      Arguments.of("ab", "ac", -1),
      // Test path covered: [1, 2, 3, 4, 10, 3, 4, 5, 6, 10, 3, 11]
      Arguments.of("ab", "b", 1),
      // Test path covered: [1, 2, 3, 4, 10, 3, 4, 10, 3, 11]
      Arguments.of("ab", "c", -1),
      // Test path covered: [1, 2, 3, 4, 5, 6, 7, 9, 6, 7, 9, 6, 10, 3, 11]
      Arguments.of("abc", "abc", 0),
      // Test path covered: [1, 2, 3, 4, 5, 6, 7, 9, 6, 7, 8, 10, 3, 11]
      Arguments.of("abc", "abd", -1),
      // Test path covered: [1, 2, 3, 4, 10, 3, 4, 5, 6, 7, 8, 10, 3, 11]
      Arguments.of("abc", "ba", -1),
      // Test path covered: [1, 2, 3, 4, 10, 3, 4, 5, 6, 7, 9, 6, 10, 3, 11]
      Arguments.of("abc", "bc", 1)
    );
  }

  @ParameterizedTest
  @MethodSource("patternsProviders")
  public void testPatternIndex(String subject, String pattern, int expected) {
    PatternIndex patternIndex = new PatternIndex();
    Path paths = patternIndex.getPaths();
    int result = patternIndex.patternIndex(subject, pattern);
    pathsRecords.add(paths.getList());

    assertEquals(expected, result, "Test: subject = " + subject + ", pattern = " + pattern);
  }


}