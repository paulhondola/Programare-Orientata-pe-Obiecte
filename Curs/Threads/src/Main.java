public class Main extends Thread{

    @Override
    public void run(){
        while(true) {
            System.out.println(this.hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        new Main().start();
        new Main().start();
        new Main().start();
    }
}