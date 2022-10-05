package ProjectOOP;

public class Step extends TestCase {
    private String description;
    private String expectedResult;

    public Step(){}

    // Getters & Setters
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }
}
