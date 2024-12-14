abstract public class SingleMaltWhiskey extends Whiskey {
    private static final int CALORIES_PER_ML = 5;
    private double alcoholPercentage;

    public SingleMaltWhiskey(String name, double alcoholPercentage) {
        super(name);
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    @Override
    public double getCalorieCount(double milliliters) {
        return alcoholPercentage * milliliters * CALORIES_PER_ML;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alcohol Percentage: " + alcoholPercentage + "%, Calories per 100ml: " +
                getCalorieCount(100) / 1000 + " kcal";
    }
}
