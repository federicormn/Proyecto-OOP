package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

enum TestCasePriority {HIGH, MEDIUM, LOW}

public class TestCase {
    private String title;
    private String description;
    private List<Step> steps = new ArrayList<Step>();
    private QA creator;
    protected TestCasePriority priority;

    boolean executed = false;

    int amountSteps;

    // Classes

    //Construct. con amountSteps parametrizado
    public TestCase(int amountSteps){}

    //Construct. sin parametros
    public TestCase() {
    }

    // Getters & Setters

    public TestCasePriority getPriority() {
        return priority;
    }

    public void setPriority(TestCasePriority priority) {
        this.priority = priority;
    }


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

    public void setSteps(List<Step> steps)
    {
        this.steps = steps;
    }

    public QA getCreator()
    {
        return creator;
    }

    public void setCreator(QA creator)
    {

        if(creator != null)
        {
            creator.addCreatedTestCase(this);
            this.creator = creator;
        }
    }
    public void addStep(Step oneStep, List<Step> steps)
    {
        this.steps.add(oneStep);
    }
}
