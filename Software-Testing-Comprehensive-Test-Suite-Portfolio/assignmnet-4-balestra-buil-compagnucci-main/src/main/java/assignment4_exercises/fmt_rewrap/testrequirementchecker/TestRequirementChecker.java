package assignment4_exercises.fmt_rewrap.testrequirementchecker;

import java.util.ArrayList;
import java.util.List;

public class TestRequirementChecker {

    public List<List<String>> findUnmetTestRequirements(List<List<String>> testPaths,
            List<List<String>> testRequirements) {
        List<List<String>> unmetRequirements = new ArrayList<>();
        for (List<String> requirement : testRequirements) {
            boolean isMet = false;
            for (List<String> testPath : testPaths) {
                if (isRequirementMet(requirement, testPath)) {
                    isMet = true;
                    break;
                }
            }
            if (!isMet) {
                unmetRequirements.add(requirement);
            }
        }
        return unmetRequirements;
    }

    private boolean isRequirementMet(List<String> requirement, List<String> testPath) {
        for (int pathIndex = 0; pathIndex < testPath.size(); pathIndex++) {
            for (int reqIndex = 0; reqIndex < requirement.size(); reqIndex++) {
                if (requirement.get(reqIndex).equals(testPath.get(pathIndex))) {
                    if (reqIndex == requirement.size() - 1) {
                        return true;
                    }
                    pathIndex++;
                } else {
                    break;
                }
            }
        }
        return false;
    }
}