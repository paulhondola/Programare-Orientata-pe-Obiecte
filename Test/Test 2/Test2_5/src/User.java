abstract public class User {
    private String username;
    abstract double getIncome(int minutesViewed);

    public User(String username) {
        this.username = username;
    }

    public String toString() {
        return username;
    }
}
