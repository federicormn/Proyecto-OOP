package ProjectOOP;

import java.util.List;

public class TestCase extends TestSuite {
    private String title;
    private Enum priority;
    private String description;
    private List<Step> steps;
    private String creator;

    // Classes
    public TestCase(){}
    public List<TestCase> showByPriority(){

        return null;
    }
    public List<TestCase> showByQA(){
        return null;
    }

    // Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Enum getPriority() {
        return priority;
    }

    public void setPriority(Enum priority) {
        this.priority = priority;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
