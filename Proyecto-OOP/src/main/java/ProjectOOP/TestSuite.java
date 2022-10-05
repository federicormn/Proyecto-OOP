package ProjectOOP;

import java.util.List;

public class TestSuite {
    private String title;
    private String sprint;
    private List<TestCase> testCases;

    private List<ExecutedTest> executedTests;

    public TestSuite(){}


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
