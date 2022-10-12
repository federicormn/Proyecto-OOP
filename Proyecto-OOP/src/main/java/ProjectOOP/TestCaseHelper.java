package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;

public class TestCaseHelper {

    // 3) Se desea tener los test cases que tienen una prioridad en específico
    public static List<TestCase> filterByPriority(TestCasePriority priority, List<TestCase> testCases) {
        List<TestCase> filteredTestCases = testCases.stream()
                .filter(tc -> tc.getPriority() == priority).collect(Collectors.toList());
        return filteredTestCases;
    }

    public static void showTests(List<TestCase> test){
        int i = 0;
        for (TestCase oneTest:test)
        {
            System.out.println(test.get(i).getDescription());
            i++;
            //System.out.println(createdByQA.get(0).getDescription());
        }
    }
}
