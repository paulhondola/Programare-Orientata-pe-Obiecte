public class IntegrationTest extends SoloTest{

    public IntegrationTest(String name, int qualityIndex) throws WrongQualityIndicatorException {
        super(name, qualityIndex);
    }

    @Override
    public String toString() {
        return "IntegrationTest(name = " + getName() + ", quality indicator = " + getQualityIndex() + ")";
    }
}
