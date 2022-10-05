package ProjectOOP;

import java.util.List;

public class Bug extends Employee {
    private String expectedResult;

    public Bug(){
    }

    public List<Bug> showBySeverity(){

        return null;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
}
