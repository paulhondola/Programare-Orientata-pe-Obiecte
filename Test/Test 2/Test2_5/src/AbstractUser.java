abstract public class AbstractUser implements User {
    private String username;

    public AbstractUser(String username) {
        this.username = username;
    }

    public String toString() {
        return username;
    }
}
