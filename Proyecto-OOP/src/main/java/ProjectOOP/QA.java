package ProjectOOP;

import java.util.*;
import java.util.stream.Collectors;

public class QA extends Employee {
        private List<TestCase> testCases = new ArrayList<TestCase>();
        private Bug reportedBug;
        private String associatedStory;

        public QA(int id, String name, String lastname, int phoneNumber, String seniority) {
                super(id, name, lastname, phoneNumber, seniority);
        }

        // 1) Se desea tener un método donde me muestre los test cases creados por un específico QA
        public List<TestCase> testCasesCreatedByQA() {
                List<TestCase> filterByQA = testCases.stream()
                        .filter(tc -> tc.getCreator().getId() == this.getId()).collect(Collectors.toList());
                return filterByQA;
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

        public void addCreatedTestCase(TestCase oneTestCase)
        {
                this.testCases.add(oneTestCase);
        }
}
