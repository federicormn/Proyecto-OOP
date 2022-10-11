package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[]args)
    {
        TestSuite suitePrueba = new TestSuite();

        //INSTANCES ********************************************
        QA qa1 = new QA();
        QA qa2 = new QA();

        DEV dev1 = new DEV();
        DEV dev2 = new DEV();

        TestCase tc1 = new TestCase(3);
        TestCase tc2 = new TestCase(2);
        TestCase tc3 = new TestCase(4);

        Bug bug1 = new Bug();
        Bug bug2 = new Bug();

        //SETTING ********************************************
        qa1.setId(1);
        qa1.setName("Fede");
        qa1.setLastname("Roman");
        qa1.setPhoneNumber(123123);
        qa1.setSeniority("junior");


        qa1.setId(2);
        qa1.setName("Ema");
        qa1.setLastname("Ditzel");
        qa1.setPhoneNumber(123124);
        qa1.setSeniority("senior");


        dev1.setId(3);
        dev1.setName("asd");
        dev1.setLastname("dsa");
        dev1.setPhoneNumber(321321);


        dev1.setId(4);
        dev1.setName("asdf");
        dev1.setLastname("dsaf");
        dev1.setPhoneNumber(231321);

        //TEST CASES

        tc1.setTitle("test case 1");
        tc1.setCreator(qa1);
        tc1.setPriority(TestCasePriority.HIGH);
        tc1.setDescription("asdasdasd");

        tc1.setSteps(tc1.amountSteps);
//        {
//
//            List<Step> stepsList = new ArrayList<>();
//            Step step1 = new Step("asd","asd");
//            Step step2 = new Step("asd2","asd2");
//            Step step3 = new Step("asd3","asd3");
//
//            stepsList.add(step1);
//            stepsList.add(step2);
//            stepsList.add(step3);
//
//            return stepsList;
//        }



        tc2.setCreator(qa1);
        tc2.setPriority(TestCasePriority.HIGH);
        tc2.setDescription("asdasdasd");
        //tc2.setSteps();
        tc2.setTitle("test case 2");


        tc3.setCreator(qa1);
        tc3.setPriority(TestCasePriority.HIGH);
        tc3.setDescription("asdasdasd");
        //tc2.setSteps();
        tc3.setTitle("test case 3");






    }
}