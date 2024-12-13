public class ComponentTest extends SoloTest{

    private int componentComplexity;

    public ComponentTest(String name, int qualityIndex, int componentComplexity) throws WrongQualityIndicatorException, WrongComponentComplexityIndicatorException {
        super(name, qualityIndex);
        if (componentComplexity < 0) {
            throw new WrongComponentComplexityIndicatorException("Component complexity indicator must be a non-negative integer.");
        }

        this.componentComplexity = componentComplexity;
    }

    @Override
    public String toString() {
        return "ComponentTest(name = " + getName() + ", quality indicator = " + getQualityIndex() + ", component complexity indicator = " + componentComplexity + ")";
    }
}
