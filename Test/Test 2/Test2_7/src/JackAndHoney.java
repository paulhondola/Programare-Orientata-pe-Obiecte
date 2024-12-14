public class JackAndHoney extends SingleMaltWhiskey {
    private static final int SWEETENER_CALORIES_PER_ML = 15;
    private int sweetenerQuantity;

    public JackAndHoney(String name, double alcoholPercentage, int sweetenerQuantity) {
        super(name, alcoholPercentage);
        this.sweetenerQuantity = sweetenerQuantity;
    }

    @Override
    public double getCalorieCount(double milliliters) {
        return super.getCalorieCount(milliliters) + sweetenerQuantity * milliliters * SWEETENER_CALORIES_PER_ML;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sweetener Quantity: " + sweetenerQuantity + "g";
    }

    public static void main(String[] args) {
        JackAndHoney whiskey = new JackAndHoney("Jack and Honey", 35, 10);
        System.out.println(whiskey);
    }
}
