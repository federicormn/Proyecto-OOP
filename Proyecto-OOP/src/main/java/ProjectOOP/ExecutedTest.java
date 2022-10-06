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

 // Punto 5) Se desea tener la cantidad de failed/passed/blocked de un test suite
    public int showByState(TestSuite suite)
    {
        int retorno = -1;

        state example = state.FAILED;



        for (state testState: state.values())
        {

        }

        return retorno;
    }

    public ExecutedTest filterByState(TestSuite suite)
    {
        return null;
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
}
