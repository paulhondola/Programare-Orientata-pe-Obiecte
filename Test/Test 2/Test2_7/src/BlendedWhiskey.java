import java.util.LinkedList;

public class BlendedWhiskey extends Whiskey {
    private LinkedList<Whiskey> whiskeys = new LinkedList<>();

    public BlendedWhiskey(String name) {
        super(name);
    }

    public void addWhiskey(Whiskey whiskey) {
        whiskeys.add(whiskey);
    }

    @Override
    public double getAlcoholPercentage() {
        double median = 0;
        for (Whiskey whiskey : whiskeys) {
            median += whiskey.getAlcoholPercentage();
        }
        return median / whiskeys.size();
    }

    @Override
    public double getCalorieCount(double milliliters) {
        double median = 0;
        for (Whiskey whiskey : whiskeys) {
            median += whiskey.getCalorieCount(milliliters);
        }
        return median / whiskeys.size();
    }

    @Override
    public String toString() {
        String result = super.toString();
        return result + ", Whiskey Blend: " + whiskeys;
    }

    public static void main(String[] args) {
        ClassicWhiskey singleton = new ClassicWhiskey("Singleton", 40);
        JackAndHoney jack = new JackAndHoney("Jack and Honey", 35, 10);

        ClassicWhiskey jackClassic = new ClassicWhiskey("Jack Classic", 50);
        JackAndHoney jackHoney = new JackAndHoney("Jack Honey", 45, 20);

        BlendedWhiskey blendedWhiskey = new BlendedWhiskey("Blended Whiskey");
        blendedWhiskey.addWhiskey(singleton);
        blendedWhiskey.addWhiskey(jack);

        BlendedWhiskey superblendedwhiskey = new BlendedWhiskey("Super Blended Whiskey");
        superblendedwhiskey.addWhiskey(jackClassic);
        superblendedwhiskey.addWhiskey(jackHoney);
        superblendedwhiskey.addWhiskey(blendedWhiskey);

        System.out.println(superblendedwhiskey);
    }
}
