import java.util.LinkedList;

public class Creator extends AbstractUser {
    private LinkedList<Subscriber> subscribers = new LinkedList<>();

    public Creator(String username) {
        super(username);
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public double getIncome(int minutesViewed) {
        double income = 0;
        for (Subscriber subscriber : subscribers) {
            income += subscriber.getIncome(minutesViewed);
        }
        return income;
    }

    @Override
    public String toString() {
        return "Username: " + super.toString() + " - creator - Subscribers: " + subscribers;
    }

    public static void main(String[] args) {
        Creator creator = new Creator("Idk");
        Subscriber subscriber1 = new Subscriber("Idk1", 2);
        Subscriber subscriber2 = new Subscriber("Idk2", 3);
        creator.addSubscriber(subscriber1);
        creator.addSubscriber(subscriber2);
        System.out.println(creator);
        System.out.println("Income: " + creator.getIncome(60));
    }
}
