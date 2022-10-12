package ProjectOOP;

import java.util.*;
import java.util.stream.Collectors;

public class QA extends Employee {
        private List<TestCase> testCases = new ArrayList<TestCase>();
        private Bug reportedBug;
        private String associatedStory;

        public QA(){
        }
        // 1) Se desea tener un método donde me muestre los test cases creados por un específico QA
        public List<TestCase> showByQA(int id)
        {
                List<TestCase> createdByQA = testCases.stream()
                        .filter(tc -> tc.getCreator().getId() == id).collect(Collectors.toList());
                //System.out.println("lista QAs " + createdByQA);

                //ESTO VA EN OTRO METODO DIOS MIO
                for (TestCase oneTest:createdByQA)
                {
                        int i = 0;
                        System.out.println(createdByQA.get(i).getDescription());
                        i++;
                        //System.out.println(createdByQA.get(0).getDescription());
                }

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

        public void addCreatedTestCase(TestCase oneTestCase)
        {
                this.testCases.add(oneTestCase);
        }
}
