class Main {
    public void doSomething(int i) {
        try {
            if(i == 0) throw new E1();
            else throw new E2();
        } catch(E1 e) {
            System.out.println("Prins");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.doSomething(0);
    }
}