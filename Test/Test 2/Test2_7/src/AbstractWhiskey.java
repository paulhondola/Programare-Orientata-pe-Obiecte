abstract public class AbstractWhiskey implements Whiskey {
    private String name;

    public AbstractWhiskey(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
