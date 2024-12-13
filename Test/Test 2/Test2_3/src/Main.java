import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        TestSuite ts = new TestSuite(new LinkedList<Test>());

        try {
            boolean flag = ts.addNewIntegrationTest("Integration Test 1", 5);
            System.out.println("Integration Test 1 added: " + flag);

            flag = ts.addNewIntegrationTest("Integration Test 2", 11);
            System.out.println("Integration Test 2 added: " + flag);

            flag = ts.addNewComponentTest("Component Test 1", 5, 3);
            System.out.println("Component Test 1 added: " + flag);

            flag = ts.addNewComponentTest("Component Test 2", 5, -3);
            System.out.println("Component Test 2 added: " + flag);
        } catch (WrongComponentComplexityIndicatorException e) {
            System.out.println("a aparut o exceptie");
        }

        System.out.println(ts);
    }
}