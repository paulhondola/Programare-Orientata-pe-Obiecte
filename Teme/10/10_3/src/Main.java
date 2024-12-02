public class Main {
    public void doSomething(int i) {
        if(i == 0) throw new E1();
        else throw new E2();
    }

    public static void main(String[] args){
        Main m = new Main();
        try{
            m.doSomething(0);
        } catch(E1 e){
            System.out.println("Caught E1");
        } catch(E2 e){
            System.out.println("Caught E2");
        }
    }
}