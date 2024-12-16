public class Joc {
    private static final int NUMAR_SUTURI = 1000;
    Echipa e1, e2;
    Minge minge;
    private String scor = "0:0";

    public Joc(String numeEchipa1, String numeEchipa2) {
        e1 = new Echipa(numeEchipa1);
        e2 = new Echipa(numeEchipa2);
    }

    public static void main(String[] args) {
        Joc joc = new Joc("Real Madrid", "Metalurgistul Cugir");
        joc.simuleaza();
        System.out.println(joc);
    }

    public void anunt() {
        System.out.println(e1.getNume() + " - " + e2.getNume() + " : Mingea se afla la coordonatele: " + minge);
    }

    public void actualizeazaScor() {
        scor = e1.getNumarGoluri() + ":" + e2.getNumarGoluri();
    }

    public String toString() {
        return e1 + "\n" + e2 + "\nScor: " + scor;
    }

    public void simuleaza() {
        CoordinateGenerator cg = new CoordinateGenerator();
        minge = new Minge();
        for (int i = 0; i < NUMAR_SUTURI; i++) {
            Echipa echipa;
            if (i % 2 == 0)
                echipa = e1;
            else
                echipa = e2;
            System.out.println(echipa.getNume() + ":");
            try {
                System.out.println("Sut");
                minge.suteaza(cg.generateX(), cg.generateY());
            } catch (Gol e) {
                System.out.println(e.getMessage());
                echipa.gol();
                actualizeazaScor();
            } catch (Out e) {
                System.out.println(e.getMessage());
                echipa.out();
            } catch (Corner e) {
                System.out.println(e.getMessage());
                echipa.corner();
            } finally {
                anunt();
            }
        }
    }
}