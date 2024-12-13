abstract public class SoloTest extends Test {
    private String name;
    private int qualityIndex;

    public SoloTest(String name, int qualityIndex) throws WrongQualityIndicatorException {
        if(qualityIndex < 1 || qualityIndex > 10) {
            throw new WrongQualityIndicatorException("Quality indicator must be between 1 and 10");
        }

        this.name = name;
        this.qualityIndex = qualityIndex;
    }

    @Override
    public int getTestsRun() {
        return 1;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getQualityIndex() {
        return qualityIndex;
    }
}
