public class SimpleTask extends AbstractTask{

    private double secondsToExecute;

    public SimpleTask(String name, double timeToExecute) {
        super(name);
        this.secondsToExecute = timeToExecute;
    }

    @Override
    public boolean execute(double secondsToRun) {
        // Task is already done
        if(this.secondsToExecute == 0) {
            return true;
        }

        // Task is now done
        if(secondsToRun >= this.secondsToExecute) {
            this.secondsToExecute = 0;
            return true;
        }

        // Task still takes time to run
        this.secondsToExecute -= secondsToRun;
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Time: " + secondsToExecute;
    }

    public static void main(String[] args) {
        SimpleTask task = new SimpleTask("Simple Task", 10);
        System.out.println(task);
        System.out.println(task.execute(5));
        System.out.println(task);
        System.out.println(task.execute(5));
        System.out.println(task);
        System.out.println(task.execute(5));
        System.out.println(task);
    }
}
