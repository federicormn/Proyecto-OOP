package ProjectOOP;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class QA extends Employee {
        private List<TestCase> testCases;
        private Bug reportedBug;
        private String associatedStory;

        public QA(){
        }
        // 1) Se desea tener un método donde me muestre los test cases creados por un específico QA
        public List<TestCase> showByQA(int id){
                List<TestCase> createdByQA = testCases.stream()
                        .filter(tc -> tc.getCreator().getId() == id).collect(Collectors.toList());
                return createdByQA;
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
