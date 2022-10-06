package ProjectOOP;

public class Step
{
    private String description;
    private String expectedResult;

    public Step(){}

    // Getters & Setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getExpectedResult()
    {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult)
    {
        this.expectedResult = expectedResult;
    }
}
