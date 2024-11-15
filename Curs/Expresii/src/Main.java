class Main {
    public static void main(String[] args) {
        // (1 + x*x)

        Expresie x = new Suma(new Constanta(1), new Inmultire(new Variabila(), new Variabila()));
        Expresie deriv1 = x.derivata();
        Expresie deriv2 = deriv1.derivata();

        System.out.println(x);
        System.out.println(deriv1);
        System.out.println(deriv2);
    }
}