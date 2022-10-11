package ProjectOOP;

import java.util.List;

enum Severity {LOW, MINOR, MAJOR, CRITICAL}

public class ExecutedTest extends TestCase{
    private String build;
    private Employee owner;
    protected Bug associatedBug;
    public Severity severity;
    private TestSuite assignedSuit;
    protected enum state{PENDING, PASSED, FAILED, BLOCKED};

    public ExecutedTest()
    {

    }
    // Getters & Setters

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
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
