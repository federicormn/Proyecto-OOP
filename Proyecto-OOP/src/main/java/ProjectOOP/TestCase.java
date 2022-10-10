package ProjectOOP;

import javax.xml.transform.stream.StreamSource;
import java.util.List;

enum TestCasePriority {HIGH, MEDIUM, LOW}

public class TestCase {
    private String title;

    private String description;
    private List<Step> steps;
    private QA creator;

    protected TestCasePriority priority;
    // Classes

    public TestCase(){}

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

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    public QA getCreator() {
        return creator;
    }

    public void setCreator(QA creator) {
        this.creator = creator;
    }
}
