package ProjectOOP;

import java.util.List;

public class ExecutedTest extends TestCase{
    private String build;
    private Employee owner;
    protected Bug associatedBug;
    private TestSuite assignedSuit;
    protected enum state{PENDING, PASSED, FAILED, BLOCKED};

    protected state currentState = state.PENDING;
    public ExecutedTest(TestCase oneTestCase)
    {
        executed = true;
        setTitle(oneTestCase.getTitle());
        setDescription(oneTestCase.getDescription());
        setSteps(oneTestCase.getSteps());
        setCreator(oneTestCase.getCreator());
        setPriority(oneTestCase.getPriority());

    }

    // Getters & Setters
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

    public void setAssignedSuit(TestSuite assignedSuit)
    {
        assignedSuit.addExecutedTestCase(this); // ?¿?¿
        this.assignedSuit = assignedSuit;
    }

    public state getCurrentState() {
        return currentState;
    }

    public void setCurrentState(state currentState) {
        this.currentState = currentState;
    }

    public String getCurrentStateString()
    {
        return currentState.toString();
    }

    @Override
    public String toString() {

        String executedString = null;
        String bug = null;
        String suite = null;

            executedString = this.getTitle()+ "{" +
                    "build='" + build + '\'' +
                    ", owner=" + owner.getName();
            if(associatedBug != null)
            {
                bug = ", associatedBug=" + associatedBug.getTitle();
            }else
            {
                bug = ", no associated bugs, ";
            }
            if(assignedSuit != null)
            {
                suite = ", assignedSuit=" + assignedSuit.getTitle() + '}';
            }else
            {
                suite = ", no associated suite.";
            }
//            executedString.concat(bug);
//            executedString.concat(suite);

        return executedString+bug+suite;
    }


    // VA TOOODO AFUERA A OTRO METODO ESTOOO -- PUNTO 5)

    public void setExecutionValues(ExecutedTest oneTest,String build, QA owner, Bug linkedBug, String state)
    {
        oneTest.setBuild(build);
        oneTest.setOwner(owner);

        switch (state)
        {
            case "PASSED":
                oneTest.setCurrentState(ExecutedTest.state.PASSED);
                break;
            case "FAILED":
                oneTest.setCurrentState(ExecutedTest.state.FAILED);
                break;
            case "BLOCKED":
                oneTest.setCurrentState(ExecutedTest.state.BLOCKED);
                break;
        }

        if(oneTest.getCurrentState().toString() == "FAILED")
        {
            oneTest.setAssociatedBug(linkedBug);
        }

    }


}
