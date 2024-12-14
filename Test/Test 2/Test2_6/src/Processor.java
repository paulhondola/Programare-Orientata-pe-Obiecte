import java.util.LinkedList;

public class Processor {
    private static final int RUNTIME = 5;

    private LinkedList<Task> tasks;

    public Processor(LinkedList<Task> tasks) {
        this.tasks = tasks;
    }

    public void finishAllTasks(){
        boolean tasksFinished = true;

        for(Task task : tasks){
            tasksFinished = tasksFinished && task.execute(RUNTIME);
        }

        if(!tasksFinished){
            finishAllTasks();
        }
    }

    @Override
    public String toString() {
        return "Processor: " + tasks;
    }

    public static void main(String[] args) {
        SimpleTask st1 = new SimpleTask("ST1", 5);
        SimpleTask st2 = new SimpleTask("ST2", 10);
        LinkedList<SimpleTask> tasks = new LinkedList<>();
        tasks.add(st1);
        tasks.add(st2);

        ComposedTask ct = new ComposedTask("CT", tasks);

        LinkedList<Task> allTasks = new LinkedList<>();
        allTasks.add(ct);
        allTasks.add(st1);

        Processor processor = new Processor(allTasks);
        System.out.println(processor);
        processor.finishAllTasks();
        System.out.println(processor);
    }
}