public class Main {
    public static void main(String[] args) {
        Intreg i1 = new Intreg(1);
        Intreg i2 = new Intreg(1);
        Intreg i3 = new Intreg(2);
        Sir s1 = new Sir("Hello");
        Sir s2 = new Sir("Hello");
        Sir s3 = new Sir("World");

        Colectie c = new Colectie(i3, s3);
        Colectie c1 = new Colectie(i1, s1);
        Colectie c2 = new Colectie(i2, s2);
        Colectie c3 = new Colectie(i1, s1, c);
        Colectie c4 = new Colectie(i2, s2, c);

        System.out.println(c1.equals(c2)); // true
        System.out.println(c3.equals(c4)); // true
        System.out.println(c1.equals(c3)); // false
    }
}
