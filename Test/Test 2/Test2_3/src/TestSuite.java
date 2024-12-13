import java.util.LinkedList;
public class TestSuite extends Test{
    private LinkedList<Test> tests;

    public TestSuite(LinkedList<Test> tests) {
        this.tests = tests;
    }

    public boolean addNewIntegrationTest(String name, int qualityIndex) {
        try {
            tests.add(new IntegrationTest(name, qualityIndex));
            return true;
        } catch (WrongQualityIndicatorException e) {
            return false;
        }
    }

    public boolean addNewComponentTest(String name, int qualityIndex, int componentComplexity) throws WrongComponentComplexityIndicatorException {
       try {
           tests.add(new ComponentTest(name, qualityIndex, componentComplexity));
           return true;
       } catch (WrongQualityIndicatorException e) {
           return false;
       } catch (WrongComponentComplexityIndicatorException e) {
           throw e;
       }
    }

    @Override
    public int getTestsRun() {
        int testsRun = 0;
        for (Test test : tests) {
            testsRun += test.getTestsRun();
        }
        return testsRun;
    }

    @Override
    public String toString() {
        String res = "TestSuite(";
        for (Test test : tests) {
            res += test.toString() + ", ";
        }
        res = res.substring(0, res.length() - 2);
        res += ")";
        return res;
    }
}
