package ProjectOOP;

import java.util.List;

public class Ticket
{
    protected String title;
    protected String description;
    protected enum priority {HIGH, MEDIUM, LOW};
    protected enum severity{Low, Minor, Major, Critical};
    protected List<Step> steps;
    protected String actualResult;
    protected Employee reporter;

    //Constructor
    public Ticket()
    {

    }

    //Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Step> getSteps() {
        return steps;
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public Employee getReporter() {
        return reporter;
    }

    public void setReporter(Employee reporter) {
        this.reporter = reporter;
    }
}
