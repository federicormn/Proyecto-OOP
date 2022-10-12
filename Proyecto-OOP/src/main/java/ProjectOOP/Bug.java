package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;
enum Severity {LOW, MINOR, MAJOR, CRITICAL};

public class Bug extends Ticket {
    private String expectedResult;
    protected DEV assignedTo;
    public Severity severity;

    public Bug(){}


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

// hacer un metodo que llame el showbyseverity y que imprima la lista
// mostrando a los bugs a travez de un bug, puso el método adentro de la clase bug, debería estar en otro lado

    public void addBugToList(List<Bug> bugs)
    {
        bugs.add(this);
    }
}

