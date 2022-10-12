package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;
enum Severity {LOW, MINOR, MAJOR, CRITICAL};

public class Bug extends Ticket {
    private String expectedResult;
    protected DEV assignedTo;
    public Severity severity;

    public Bug()
    {


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

    // Se desea tener los bugs que tienen una severidad específica, filtrar lista ExecutedTest --> NO
    public List<Bug> showBySeverity(Severity severity, List<Bug> createdBugs)
    {
        List<Bug> bugsBySeverity = createdBugs.stream()
                .filter(tc -> tc.getSeverity() == severity).collect(Collectors.toList());
        //METER A OTRO METODO PARA MOSTRAR
        int i = 0;
        for (Bug oneBug:bugsBySeverity)
        {
            System.out.println(bugsBySeverity.get(i).getDescription());
            i++;
            //System.out.println(createdByQA.get(0).getDescription());
        }
        return bugsBySeverity;
    }

    public void addBugToList(List<Bug> bugs)
    {
        bugs.add(this);
    }
}
