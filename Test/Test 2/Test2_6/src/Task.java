abstract public class Task {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String toString() {
        return "Task: " + name;
    }

    abstract public boolean execute(double secondsToRun);
}
