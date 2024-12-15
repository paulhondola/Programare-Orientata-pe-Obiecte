abstract public class AbstractTask implements Task{

    private String name;

    public AbstractTask(String name) {
        this.name = name;
    }

    public String toString() {
        return "Task: " + name;
    }
}
