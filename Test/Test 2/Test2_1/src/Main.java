public class Main {
    public static void main(String[] args) {
        Utilizator  dan = new Utilizator("Dan");
        Utilizator  marius = new Utilizator("Marius");
        Utilizator alex = new Utilizator("Alex");
        Grup carnivorii = new Grup("Carnivorii");

        try {
            carnivorii.inscrie(dan);
            carnivorii.inscrie(marius);
            carnivorii.inscrie(alex);
            carnivorii.inscrie(alex);
        } catch (DestinatarDuplicat e) {
            System.out.println(e.getMessage());
        }

        alex.trimite(carnivorii, "Am deschis magazinul");
        marius.trimite(carnivorii, "Vin acuma");

        System.out.println(dan);
        System.out.println(marius);
        System.out.println(alex);
        System.out.println(carnivorii);
    }
}