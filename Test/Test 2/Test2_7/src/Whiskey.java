abstract public class Whiskey {
    private String name;

    public Whiskey(String name) {
        this.name = name;
    }

    abstract public double getCalorieCount(double milliliters);

    abstract public double getAlcoholPercentage();

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
