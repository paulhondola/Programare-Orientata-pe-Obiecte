public class ClassicWhiskey extends SingleMaltWhiskey {
    public ClassicWhiskey(String name, double alcoholPercentage) {
        super(name, alcoholPercentage);
    }

    public static void main(String[] args) {
        ClassicWhiskey whiskey = new ClassicWhiskey("Jack", 40);
        System.out.println(whiskey);
    }
}
