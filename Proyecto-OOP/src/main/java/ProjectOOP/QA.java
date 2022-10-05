package ProjectOOP;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class QA extends Employee {
        private List<TestCase> testCases;
        private Bug reportedBug;
        private String associatedStory;

        public QA(){
        }

        // Getters & Setters
        public List<TestCase> getTestCases() {
                return testCases;
        }

        public void setTestCases(List<TestCase> testCases) {
                this.testCases = testCases;
        }

        public Bug getReportedBug() {
                return reportedBug;
        }

        public void setReportedBug(Bug reportedBug) {
                this.reportedBug = reportedBug;
        }

        public String getAssociatedStory() {
                return associatedStory;
        }

        public void setAssociatedStory(String associatedStory) {
                this.associatedStory = associatedStory;
        }
}
