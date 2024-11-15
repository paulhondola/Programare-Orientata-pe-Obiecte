class Main {
    public static void main(String[] args) {
        // (1 + x*x)

        Expresie x = new Suma(new Constanta(1), new Inmultire(new Variabila(), new Variabila()));
        System.out.println(x);
        System.out.println(x.derivata());
        System.out.println(x.derivata().derivata());

    }
}