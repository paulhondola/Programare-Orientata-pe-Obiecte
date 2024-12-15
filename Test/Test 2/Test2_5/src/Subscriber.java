public class Subscriber extends AbstractUser {
    private static final double INCOME_RATE = 1.5;
    private int subscriptionLevel;

    public Subscriber(String username, int subscriptionLevel) {
        super(username);
        this.subscriptionLevel = subscriptionLevel;
    }

    @Override
    public double getIncome(int minutesViewed) {
        return INCOME_RATE * subscriptionLevel * minutesViewed;
    }

    @Override
    public String toString() {
        return "Username: " + super.toString() + " - subscriber - Level: " + subscriptionLevel;
    }

    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber("Idk", 2);
        System.out.println(subscriber);
        System.out.println("Income: " + subscriber.getIncome(60));
    }
}
