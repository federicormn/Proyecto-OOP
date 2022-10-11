package ProjectOOP;

import java.util.List;
import java.util.stream.Collectors;

public class Bug extends Ticket {
    private String expectedResult;

    protected Employee assignedTo;

    public Bug(){
    }


    // Getters & Setters
    public Employee getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Employee assignedTo) {
        this.assignedTo = assignedTo;
    }
    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
}
