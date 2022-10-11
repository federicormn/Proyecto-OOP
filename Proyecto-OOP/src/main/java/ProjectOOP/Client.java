package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[]args)
    {


        //INSTANCES ********************************************

        TestSuite suitePrueba = new TestSuite();

        QA qa1 = new QA();
        QA qa2 = new QA();

        DEV dev1 = new DEV();
        DEV dev2 = new DEV();

        TestCase tc1 = new TestCase(3);
        TestCase tc2 = new TestCase(2);
        TestCase tc3 = new TestCase(4);

        Bug bug1 = new Bug();
        Bug bug2 = new Bug();

        Enhancement enhancement1 = new Enhancement();

        //SETTING ********************************************

        //QAs inputs
        qa1.setId(1);
        qa1.setName("Fede");
        qa1.setLastname("Roman");
        qa1.setPhoneNumber(123123);
        qa1.setSeniority("junior");


        qa2.setId(2);
        qa2.setName("Ema");
        qa2.setLastname("Ditzel");
        qa2.setPhoneNumber(123124);
        qa2.setSeniority("senior");

        //DEVs inputs
        dev1.setId(3);
        dev1.setName("asd");
        dev1.setLastname("dsa");
        dev1.setPhoneNumber(321321);


        dev2.setId(4);
        dev2.setName("asdf");
        dev2.setLastname("dsaf");
        dev2.setPhoneNumber(231321);


        //TCs inputs
        tc1.setTitle("test case 1");
        tc1.setCreator(qa1);
        tc1.setPriority(TestCasePriority.HIGH);
        tc1.setDescription("asdasdasd");

        Step TC1_step1 = new Step("asd","asd");
        Step TC1_step2 = new Step("asd2","asd2");
        Step TC1_step3 = new Step("asd3","asd3");

//        tc1.addStep(TC1_step1, tc1.getSteps());
//        tc1.addStep(TC1_step2, tc1.getSteps());
//        tc1.addStep(TC1_step3, tc1.getSteps());

////        tc1.setSteps(tc1.amountSteps);
////        {
////
////            List<Step> stepsList = new ArrayList<>();
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


        tc2.setTitle("test case 2");
        tc2.setCreator(qa2);
        tc2.setPriority(TestCasePriority.HIGH);
        tc2.setDescription("asdasdasd");

        Step TC2_step1 = new Step("asd","asd");
        Step TC2_step2 = new Step("asd2","asd2");

//        tc2.addStep(TC2_step1, tc1.getSteps());
//        tc2.addStep(TC2_step2, tc1.getSteps());

        tc3.setTitle("test case 3");
        tc3.setCreator(qa1);
        tc3.setPriority(TestCasePriority.HIGH);
        tc3.setDescription("asdasdasd");

        Step TC3_step1 = new Step("asd","asd");
        Step TC3_step2 = new Step("asd2","asd2");
        Step TC3_step3 = new Step("asd3","asd3");
        Step TC3_step4 = new Step("asd4","asd4");

//        tc3.addStep(TC3_step1, tc1.getSteps());
//        tc3.addStep(TC3_step2, tc1.getSteps());
//        tc3.addStep(TC3_step3, tc1.getSteps());
//        tc3.addStep(TC3_step4, tc1.getSteps());

        //BUGs inputs
        bug1.setExpectedResult("algo");
        bug1.setActualResult("algon't");
        bug1.setDescription("hola");
        bug1.setReporter(qa1);
        bug1.setSteps(tc1.getSteps()); // VERIFICAR QUE SEAN LOS MISMOS PASOS DEL TC ASOCIADO
        bug1.setTitle("titulo bug 1");
        bug1.setAssignedTo(dev1);

        bug2.setExpectedResult("algo2");
        bug2.setActualResult("algon't2");
        bug2.setDescription("hola 2");
        bug2.setReporter(qa2);
        bug2.setSteps(tc2.getSteps()); // VERIFICAR QUE SEAN LOS MISMOS PASOS DEL TC ASOCIADO
        bug2.setTitle("titulo bug 2");
        bug2.setAssignedTo(dev2);

        //ENHANCEMENT inputs --> DEBE EXISTIR UN TICKET PARA ASOCIAR
        enhancement1.setTitle("algo3");
        enhancement1.setSteps(tc1.getSteps()); // PUEDEN O NO SER PASOS DE UN TC
        enhancement1.setActualResult("algon't3");
        enhancement1.setSuggestedResult("algorovich");
        enhancement1.setReporter(qa1);

        //TEST SUIT inputs
        suitePrueba.setSprint("Sprint 1");
        suitePrueba.setTitle("Suite 1");
        //suitePrueba.setTestCases();


        //OUTPUTS ********************************************

        // 1) Se desea tener un método donde me muestre los test cases creados por un específico QA
        //qa1.showByQA(qa1.getId());

        // 2) Se desea tener un método que me muestre los bugs asignados a un específico desarrollador
        //dev1.assignedBugsToDev(dev1.getId());

        // 3) Se desea tener los test cases que tienen una prioridad en específico
        //suitePrueba.showByPriority(TestCasePriority.HIGH);

        // 4) Se desea tener los bugs que tienen una severidad específica
        //suitePrueba.showBySeverity(Severity.MAJOR);

        // 5) Se desea tener la cantidad de failed/passed/blocked de un test suite
        //suitePrueba.showExecutedTestByState();

        System.out.println("****** SUITE *******");
        System.out.println(suitePrueba.getSprint());

        System.out.println("****** QAs *******");
        System.out.println(qa1.getId());
        System.out.println(qa2.getId());

        System.out.println("****** DEVs *******");
        System.out.println(dev1.getId());
        System.out.println(dev2.getId());

        System.out.println("****** TCs *******");
        System.out.println(tc1.getCreator().getName());
        System.out.println(tc2.getCreator().getName());
        System.out.println(tc3.getCreator().getName());

        System.out.println("****** BUGs *******");
        System.out.println(bug1.getExpectedResult());
        System.out.println(bug2.getExpectedResult());

        System.out.println("****** ENHs *******");
        System.out.println(enhancement1.getSuggestedResult());


    }
}