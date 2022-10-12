package ProjectOOP;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[]args)
    {


        //**************************************** INSTANCES ********************************************

        TestSuite suitePrueba = new TestSuite();
        List<Bug> createdBugs = new ArrayList<Bug>(); //AUXILIAR LIST FOR CREATED BUGS

        QA qa1 = new QA();
        QA qa2 = new QA();

        DEV dev1 = new DEV();
        DEV dev2 = new DEV();

        TestCase tc1 = new TestCase(3);
        TestCase tc2 = new TestCase(2);
        TestCase tc3 = new TestCase(4);

        ExecutedTest exec1 = new ExecutedTest(tc1);
        ExecutedTest exec2 = new ExecutedTest(tc2);
        ExecutedTest exec3 = new ExecutedTest(tc3);

        Bug bug1 = new Bug();
        Bug bug2 = new Bug();

        Enhancement enhancement1 = new Enhancement();

        //**************************************** SETTING INPUTS ****************************************

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
        tc1.setPriority(TestCasePriority.LOW);
        tc1.setDescription("asdasdasd1");

        Step TC1_step1 = new Step("asd","asd");
        Step TC1_step2 = new Step("asd2","asd2");
        Step TC1_step3 = new Step("asd3","asd3");

        tc1.addStep(TC1_step1, tc1.getSteps()); //
        tc1.addStep(TC1_step2, tc1.getSteps()); //Crear un step aux, pasar x param. los valores y agregarlo a la List*
        tc1.addStep(TC1_step3, tc1.getSteps());

        tc2.setTitle("test case 2");
        tc2.setCreator(qa2);
        tc2.setPriority(TestCasePriority.HIGH);
        tc2.setDescription("asdasdasd2");

        Step TC2_step1 = new Step("asd","asd");
        Step TC2_step2 = new Step("asd2","asd2");

        tc2.addStep(TC2_step1, tc1.getSteps()); //Crear un step aux, pasar x param. los valores y agregarlo a la List*
        tc2.addStep(TC2_step2, tc1.getSteps());

        tc3.setTitle("test case 3");
        tc3.setCreator(qa1);
        tc3.setPriority(TestCasePriority.HIGH);
        tc3.setDescription("asdasdasd3");

        Step TC3_step1 = new Step("asd","asd");
        Step TC3_step2 = new Step("asd2","asd2");
        Step TC3_step3 = new Step("asd3","asd3");
        Step TC3_step4 = new Step("asd4","asd4");

        tc3.addStep(TC3_step1, tc1.getSteps()); //Crear un step aux, pasar x param. los valores y agregarlo a la List*
        tc3.addStep(TC3_step2, tc1.getSteps());
        tc3.addStep(TC3_step3, tc1.getSteps());
        tc3.addStep(TC3_step4, tc1.getSteps());

        //Executed TCs inputs
        exec1.setBuild("Version 1.0");
        exec1.setAssignedSuit(suitePrueba);
        exec1.setOwner(qa1);
        //exec1.setAssociatedBug(); // IF currentState == FAILED; // LLAMAR AL SETTER EN SetCurrentState == FAILED?¿?¿
        exec1.setCurrentState(ExecutedTest.state.PASSED);

        exec2.setBuild("Version 2.0");
        exec2.setAssignedSuit(suitePrueba);
        exec2.setOwner(qa2);
        exec2.setCurrentState(ExecutedTest.state.BLOCKED);

        exec3.setBuild("Version 3.0");
        exec3.setAssignedSuit(suitePrueba);
        exec3.setOwner(qa1);
        exec3.setCurrentState(ExecutedTest.state.FAILED);
        exec3.setAssociatedBug(bug1);


        //BUGs inputs
        bug1.setExpectedResult("algo");
        bug1.setActualResult("algon't");
        bug1.setDescription("hola soy el bug 1");
        bug1.setReporter(qa1);
        bug1.setSteps(tc1.getSteps()); // VERIFICAR QUE SEAN LOS MISMOS PASOS DEL TC ASOCIADO
        bug1.setTitle("titulo bug 1");
        bug1.setAssignedTo(dev1);
        bug1.setSeverity(Severity.MAJOR);
        bug1.addBugToList(createdBugs);

        bug2.setExpectedResult("algo2");
        bug2.setActualResult("algon't2");
        bug2.setDescription("hola soy el bug 2");
        bug2.setReporter(qa2);
        bug2.setSteps(tc2.getSteps()); // VERIFICAR QUE SEAN LOS MISMOS PASOS DEL TC ASOCIADO
        bug2.setTitle("titulo bug 2");
        bug2.setAssignedTo(dev2);
        bug2.setSeverity(Severity.MAJOR);
        bug2.addBugToList(createdBugs);

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

        //**************************************** OUTPUTS ********************************************

        System.out.println("\n\n******************** OUTPUTS DEL SISTEMA ********************\n");
        // 1) Se desea tener un método donde me muestre los test cases creados por un específico QA
        System.out.println("Test cases asignados al QA "+ qa1.getName() + ":");
        qa1.showByQA(qa1.getId());

        // 2) Se desea tener un método que me muestre los bugs asignados a un específico desarrollador
        System.out.println("\nBugs asignados al dev " + dev1.getName()+ ":");
        dev1.assignedBugsToDev(dev1.getId());

        // 3) Se desea tener los test cases que tienen una prioridad en específico
        suitePrueba.showByPriority(TestCasePriority.HIGH);

        // 4) Se desea tener los bugs que tienen una severidad específica
        System.out.println("\nBugs con severidad " + Severity.MAJOR);
        bug1.showBySeverity(Severity.MAJOR, createdBugs); // METHOD executeTest() ¿? -- NO AMIGO ARREGLA ESTO

        // 5) Se desea tener la cantidad de failed/passed/blocked de un test suite

        System.out.println("\nCantidad de Failed/Passed/Blocked para el test suit '"+ suitePrueba.getTitle()+ "':");
        suitePrueba.showExecutedTestByState();

        //******************************************** END OUTPUTS ********************************************
    }
}