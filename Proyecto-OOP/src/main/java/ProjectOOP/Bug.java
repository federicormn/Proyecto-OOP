package ProjectOOP;

import java.util.List;

public class Bug extends Ticket {
    private String expectedResult;

    public Bug(){
    }


    // Getters & Setters
    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
}
