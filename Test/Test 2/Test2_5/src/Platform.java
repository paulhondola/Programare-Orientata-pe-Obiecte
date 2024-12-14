import java.util.ArrayList;

public class Platform {
    private static final int MAX_USERS = 1000;
    private ArrayList<User> users = new ArrayList<>(1000);

    public boolean addUser(User user) {
        if (users.size() >= MAX_USERS)
            return false;

        users.add(user);
        return true;
    }

    public User getVIPUser(int minutesViewed) {
        double maxIncome = -1;
        User vipUser = null;
        for (User user : users) {
            double income = user.getIncome(minutesViewed);
            if (maxIncome < income) {
                maxIncome = income;
                vipUser = user;
            }
        }
        return vipUser;
    }

    public static void main(String[] args) {
        Platform twitch = new Platform();

        Subscriber sub0 = new Subscriber("sub0", 10);
        Subscriber sub1 = new Subscriber("sub1", 1);
        Subscriber sub2 = new Subscriber("sub2", 2);
        Subscriber sub3 = new Subscriber("sub3", 3);
        Subscriber sub4 = new Subscriber("sub4", 4);
        Subscriber sub5 = new Subscriber("sub5", 5);

        Creator creator0 = new Creator("creator0");
        Creator creator1 = new Creator("creator1");

        creator0.addSubscriber(sub1);
        creator0.addSubscriber(sub2);

        creator1.addSubscriber(sub3);
        creator1.addSubscriber(sub4);
        creator1.addSubscriber(sub5);

        twitch.addUser(sub0);
        twitch.addUser(creator0);
        twitch.addUser(creator1);

        System.out.println(twitch.getVIPUser(30));
    }
}
