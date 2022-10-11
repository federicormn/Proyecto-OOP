package ProjectOOP;

public class Client {

    public static void main(String[]args){
        TestSuite suitePrueba = new TestSuite();

        //EMPLOYEES
        QA qa1 = new QA();
        qa1.setId(1);
        qa1.setName("Fede");
        qa1.setLastname("Roman");
        qa1.setPhoneNumber(123123);
        qa1.setSeniority("junior");

        QA qa2 = new QA();
        qa1.setId(2);
        qa1.setName("Ema");
        qa1.setLastname("Ditzel");
        qa1.setPhoneNumber(123124);
        qa1.setSeniority("senior");

        DEV dev1 = new DEV();
        dev1.setId(3);
        dev1.setName("asd");
        dev1.setLastname("dsa");
        dev1.setPhoneNumber(321321);

        DEV dev2 = new DEV();
        dev1.setId(4);
        dev1.setName("asdf");
        dev1.setLastname("dsaf");
        dev1.setPhoneNumber(231321);

        //TEST CASES
        TestCase tc1 = new TestCase();
        tc1.setCreator(qa1);
        tc1.setPriority(TestCasePriority.HIGH);
        tc1.setDescription("asdasdasd");
        tc1.setSteps();
        tc1.setTitle("test case 1");

        TestCase tc2 = new TestCase();
        tc2.setCreator(qa1);
        tc2.setPriority(TestCasePriority.HIGH);
        tc2.setDescription("asdasdasd");
        tc2.setSteps();
        tc2.setTitle("test case 1");

        TestCase tc3 = new TestCase();
        tc2.setCreator(qa1);
        tc2.setPriority(TestCasePriority.HIGH);
        tc2.setDescription("asdasdasd");
        tc2.setSteps();
        tc2.setTitle("test case 1");

        //BUGS
        Bug bug1 = new Bug();

        Bug bug2 = new Bug();



    }
}