public class Main {
    public static void main(String[] args) {

        Greutate g1 = new GreutateSimpla(10);
        Greutate g2 = new GreutateSimpla(20);
        Greutate g3 = new GreutateSimpla(30);

        Greutate g4 = new GreutateDubla(g1, g2);
        Greutate g5 = new GreutateDubla(g3, g4);
        Greutate g6 = new GreutateMultipla(new Greutate[]{g1, g2, g3, g4, g5});

        System.out.println(g1.capacitate());
        System.out.println(g2.capacitate());
        System.out.println(g3.capacitate());
        System.out.println(g4.capacitate());
        System.out.println(g5.capacitate());
        System.out.println(g6.capacitate());

        ColectieGreutati cg = new ColectieGreutati(10);
        cg.adauga(g1);
        cg.adauga(g2);
        cg.adauga(g3);
        cg.adauga(g4);
        cg.adauga(g5);
        cg.adauga(g6);

        System.out.println("Capacitate colectie: " + cg.capacitate());
        System.out.println("Numarul de greutati din colectie: " + cg.numarGreutati());
        System.out.println("Media: " + cg.medie());
    }
}