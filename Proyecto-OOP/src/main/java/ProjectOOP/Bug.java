package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;
enum Severity {LOW, MINOR, MAJOR, CRITICAL};

public class Bug extends Ticket {
    private String expectedResult;
    protected DEV assignedTo;
    public Severity severity;

   private String description;

    public Bug(Employee reporter, String title, List<Step> steps, String expectedResult, String actualResult, DEV assignedTo, Severity severity, String description) {
        super();
        this.expectedResult = expectedResult;
        this.assignedTo = assignedTo;
        this.severity = severity;
        this.description = description;
        this.steps = steps;
        this.title = title;
        this.reporter = reporter;
        this.actualResult = actualResult;
    }

    public Bug(){

    }
    // Getters & Setters
    public String getExpectedResult()
    {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult)
    {
        this.expectedResult = expectedResult;
    }

    public DEV getAssignedTo()
    {
        return assignedTo;
    }

    public void setAssignedTo(DEV assignedTo)
    {
        assignedTo.setAssociatedBugs(this);
        this.assignedTo = assignedTo;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
    // hacer un metodo que llame el showbyseverity y que imprima la lista
// mostrando a los bugs a travez de un bug, puso el método adentro de la clase bug, debería estar en otro lado

    public void addBugToList(List<Bug> bugs)
    {
        bugs.add(this);
    }
}

