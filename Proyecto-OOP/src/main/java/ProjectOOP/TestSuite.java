package ProjectOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSuite
{
    private String title;
    private String sprint;
    private List<TestCase> testCases = new ArrayList<TestCase>();
    private List<ExecutedTest> executedTests = new ArrayList<ExecutedTest>();

    public TestSuite(){}


    // Se desea tener los bugs que tienen una severidad específica, filtrar lista ExecutedTest
    public List<ExecutedTest> showBySeverity(Severity severity)
    {
            List<ExecutedTest> bugsBySeverity = executedTests.stream()
                    .filter(tc -> tc.getSeverity() == severity).collect(Collectors.toList());
            return bugsBySeverity;
    }

    // 3) Se desea tener los test cases que tienen una prioridad en específico
    public List<TestCase> showByPriority(TestCasePriority priority)
    {
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

    public void setExecutedTests(List<ExecutedTest> executedTests)
    {
        this.executedTests = executedTests;
    }

    // Punto 5) Se desea tener la cantidad de failed/passed/blocked de un test suite
    public int showExecutedTestByState()
    {
        int retorno = -1;
        if(executedTests != null)
        {
            for ( ExecutedTest singleTest : executedTests)
            {

                switch(singleTest.getCurrentStateString())
                {
                    case "PENDING":
                        System.out.println("PENDING:");
                        System.out.println(singleTest.toString());
                        break;
                    case "PASSED":
                        System.out.println("PASSED");
                        System.out.println(singleTest.toString());
                        break;
                    case "FAILED":
                        System.out.println("FAILED");
                        System.out.println(singleTest.toString());
                        break;
                    case "BLOCKED":
                        System.out.println("BLOCKED");
                        System.out.println(singleTest.toString());
                        break;

                }
                retorno = 0;
            }
        }

        return retorno;
    }

    public void addTestCase(TestCase oneTestCase)
    {
        this.testCases.add(oneTestCase);
    }

}
