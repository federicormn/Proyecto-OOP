package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[]args)
    {

        //**************************************** INSTANCES ********************************************
        QA qa1 = new QA(1, "Emanuel","Ditzel", 22222323, "Jr");
        QA qa2 = new QA(2, "Federico","Riquelme", 21782323, "Ssr");

        DEV dev1 = new DEV(3, "Juan","Figueroa", 2282323, "Jr");
        DEV dev2 = new DEV(4, "Tim","Burton", 21982723, "Sr");

        TestSuite suitePrueba = new TestSuite("Login Test Suite");

        List<Bug> createdBugs = new ArrayList<Bug>(); //AUXILIAR LIST FOR CREATED BUGS


        List<Step> loginBugSteps = new ArrayList<Step>();
        loginBugSteps.add(new Step("Open application", "Should be able to see [Login] button"));
        loginBugSteps.add(new Step("Click on [Login] button", "Should be redirected to the main page"));

        List<Step> registerBugSteps = new ArrayList<Step>();
        registerBugSteps.add(new Step("Open application", "Should be able to see [Register] button"));

        Bug bug1 = new Bug(qa1, "[OOP-002] Login error", loginBugSteps, "The user should be able to login successfully", "[Login] button doesn't do anything", dev1, Severity.MAJOR, "[Login] button doesn't work");
        bug1.addBugToList(createdBugs);
        Bug bug2 = new Bug(qa2, "[OOP-001] Register error", registerBugSteps, "The user should be able to register successfully", "[Register] button is not visible", dev2, Severity.MAJOR, "[Register] button is not visible");
        bug2.addBugToList(createdBugs);




        TestCase tc1 = new TestCase("Register Test Case","Test regitster button functionality.", new ArrayList<Step>(), qa1, TestCasePriority.HIGH,false, 2 );
        TestCase tc2 = new TestCase("Login Test Case","Test login functionality.", new ArrayList<Step>(), qa2, TestCasePriority.HIGH,false, 2 );
        TestCase tc3 = new TestCase("Delete Account Test Case","Test regitster functionality.", new ArrayList<Step>(), qa1, TestCasePriority.HIGH,false, 2 );


        ExecutedTest exec1 = new ExecutedTest(tc1, "Version 1.0",qa1, bug1, suitePrueba, ExecutedTest.state.FAILED);
        ExecutedTest exec2 = new ExecutedTest(tc2, "Version 2.0",qa1, bug2, suitePrueba, ExecutedTest.state.BLOCKED);
        ExecutedTest exec3 = new ExecutedTest(tc3, "Version 3.0",qa2, bug1, suitePrueba, ExecutedTest.state.PASSED);



        Enhancement enhancement1 = new Enhancement();

        //**************************************** SETTING INPUTS ****************************************

        //QAs inputs


        //TCs inputs
        Step TC1_step1 = new Step("asd","asd");
        Step TC1_step2 = new Step("asd2","asd2");
        Step TC1_step3 = new Step("asd3","asd3");

        tc1.addStep(TC1_step1);
        tc1.addStep(TC1_step2);
        tc1.addStep(TC1_step3);


        Step TC2_step1 = new Step("asd","asd");
        Step TC2_step2 = new Step("asd2","asd2");

        tc2.addStep(TC2_step1);
        tc2.addStep(TC2_step2);


        Step TC3_step1 = new Step("asd","asd");
        Step TC3_step2 = new Step("asd2","asd2");
        Step TC3_step3 = new Step("asd3","asd3");
        Step TC3_step4 = new Step("asd4","asd4");

        tc3.addStep(TC3_step1);
        tc3.addStep(TC3_step2);
        tc3.addStep(TC3_step3);
        tc3.addStep(TC3_step4);

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

        //ADDING TEST CASES TO SUIT
        suitePrueba.addTestCase(tc1);
        suitePrueba.addTestCase(tc2);
        suitePrueba.addTestCase(tc3);

        suitePrueba.addExecutedTestCase(exec1);
        suitePrueba.addExecutedTestCase(exec2);
        suitePrueba.addExecutedTestCase(exec3);

        //**************************************** OUTPUTS ********************************************
//Arreglar formateo de datos
        // steps - hay que crear los steps desp de creado tc y agregar la lista con su tamaño y agregarlo como atributo de test case.
        System.out.println("\n\n******************** OUTPUTS DEL SISTEMA ********************\n");
        // 1) Se desea tener un método donde me muestre los test cases creados por un específico QA
        System.out.println("Test cases asignados al QA "+ qa1.getName() + ":");
        TestCaseHelper.showTests(qa1.testCasesCreatedByQA());


        // 2) Se desea tener un método que me muestre los bugs asignados a un específico desarrollador
        System.out.println("\nBugs asignados al dev " + dev1.getName()+ ":");
        BugHelper.showBugs(dev1.assignedBugsToDev());


        // 3) Se desea tener los test cases que tienen una prioridad en específico
        System.out.println("Test cases con prioridad:");

        TestCaseHelper.showTests(TestCaseHelper.filterByPriority(TestCasePriority.HIGH, suitePrueba.getTestCases()));
        // mover filterBypri.. a TestSuite.
        // 4) Se desea tener los bugs que tienen una severidad específica
        System.out.println("\nBugs con severidad " + Severity.MAJOR);

        BugHelper.showBugs(BugHelper.filterBySeverity(Severity.MAJOR, createdBugs));

        // 5) Se desea tener la cantidad de failed/passed/blocked de un test suite

        System.out.println("\nCantidad de Failed/Passed/Blocked para el test suit '"+ suitePrueba.getTitle()+ "':");
        suitePrueba.showExecutedTestByState();

        //******************************************** END OUTPUTS ********************************************
    }
}