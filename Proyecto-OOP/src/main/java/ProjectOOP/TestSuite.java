package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;

public class TestSuite {
    private String title;
    private String sprint;
    private List<TestCase> testCases;

    private List<ExecutedTest> executedTests;

    public TestSuite(){}


    // Se desea tener los bugs que tienen una severidad específica, filtrar lista ExecutedTest
    public List<ExecutedTest> showBySeverity(Severity severity){

        List<ExecutedTest> bugsBySeverity = executedTests.stream()
                .filter(tc -> tc.getSeverity() == severity).collect(Collectors.toList());
           return bugsBySeverity;
    }

    // 3) Se desea tener los test cases que tienen una prioridad en específico
    public List<TestCase> showByPriority(TestCasePriority priority){
        List<TestCase> filteredTestCases = testCases.stream()
                .filter(tc -> tc.getPriority() == priority).collect(Collectors.toList());
        return filteredTestCases;
    }


    // Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public List<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCase> testCases) {
        this.testCases = testCases;
    }

    public List<ExecutedTest> getExecutedTests() {
        return executedTests;
    }

    public void setExecutedTests(List<ExecutedTest> executedTests) {
        this.executedTests = executedTests;
    }
}
