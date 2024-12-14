import java.util.LinkedList;

public class ComposedTask extends Task{
    private LinkedList<SimpleTask> simpleTasks;

    public ComposedTask(String name, LinkedList<SimpleTask> simpleTaskstasks) {
        super(name);
        this.simpleTasks = simpleTaskstasks;
    }

    @Override
    public boolean execute(double secondsToRun) {
        int tasksDone = 0;
        double sharedTime = secondsToRun / simpleTasks.size();
        for(SimpleTask task : simpleTasks){
            if(task.execute(sharedTime)){
                tasksDone++;
            }
        }
        return tasksDone == simpleTasks.size();
    }

    @Override
    public String toString() {
        return super.toString() + ", Content: " + simpleTasks;
    }

    public static void main(String[] args) {
        LinkedList<SimpleTask> tasks = new LinkedList<>();
        tasks.add(new SimpleTask("Simple Task 1", 10));
        tasks.add(new SimpleTask("Simple Task 2", 20));

        ComposedTask task = new ComposedTask("Composed Task", tasks);
        System.out.println(task);

        task.execute(10);
        System.out.println(task);

        task.execute(10);
        System.out.println(task);

        task.execute(10);
        System.out.println(task);
    }
}
