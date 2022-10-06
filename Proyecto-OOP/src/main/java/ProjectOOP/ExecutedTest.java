package ProjectOOP;

import java.util.List;

public class ExecutedTest extends TestCase
{
    private String build;
    private Employee owner;
    private Bug associatedBug;
    private TestSuite assignedSuit;
    private enum state{PENDING, PASSED, FAILED, BLOCKED};
    private state currentState = state.PENDING;

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

    public state getCurrentState()
        {
            return currentState;
        }
        public void setCurrentState(state currentState)
        {
            this.currentState = currentState;
    }

        public String getCurrentStateString()
    {
        return currentState.toString();
    }

    @Override
    public String toString() {
        return "ExecutedTest{" +
                "build='" + build + '\'' +
                ", owner=" + owner +
                ", associatedBug=" + associatedBug +
                ", assignedSuit=" + assignedSuit +
                '}';
    }
}
