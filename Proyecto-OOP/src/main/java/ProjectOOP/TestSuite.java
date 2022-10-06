package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;

public class TestSuite {
    private String title;
    private String sprint;
    private List<TestCase> testCases;

    private List<ExecutedTest> executedTests;

    public TestSuite(){}

    // Se desea tener un método donde me muestre los test cases creados por un específico QA
    public List<TestCase> showByQA(int id){
        List<TestCase> createdByQA = testCases.stream()
                .filter(tc -> tc.getCreator().getId() == id).collect(Collectors.toList());
        return createdByQA;
    }

    public List<Bug> showBySeverity(){
// filtrar lista ExecutedTest
        return null;
    }

    // Se desea tener los test cases que tienen una prioridad en específico
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

    public void setExecutedTests(List<ExecutedTest> executedTests)
    {
        this.executedTests = executedTests;
    }

    // Punto 5) Se desea tener la cantidad de failed/passed/blocked de un test suite
    public int showExecutedTestByState()
    {
        int retorno = -1;
        for ( ExecutedTest singleTest : executedTests)
        {
            if(singleTest.getCurrentStateString() == "PENDING")
            {

            }

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

        }
        return retorno;
    }
}
