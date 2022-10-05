package ProjectOOP;

import java.util.List;

public class ExecutedTest
{
    private String build;
    private Employee owner;
    private Bug associatedBug;
    private TestSuite assignedSuit;
    private enum state{PENDING, PASSED, FAILED, BLOCKED};

    public ExecutedTest()
    {

    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public Bug getAssociatedBug() {
        return associatedBug;
    }

    public void setAssociatedBug(Bug associatedBug) {
        this.associatedBug = associatedBug;
    }

    public TestSuite getAssignedSuit() {
        return assignedSuit;
    }

    public void setAssignedSuit(TestSuite assignedSuit) {
        this.assignedSuit = assignedSuit;
    }

    public List<ExecutedTest> showByState(TestSuite suite)
    {
        List<ExecutedTest> pending;
        List<ExecutedTest> passed;
        List<ExecutedTest> failed;
        List<ExecutedTest> blocked;
        state example = state.FAILED;

        for (ExecutedTest executedTests: suite.getExecutedTests())
        {

        }

        return null;
    }

    public ExecutedTest filterByState(TestSuite suite)
    {
        return null;
    }
}
