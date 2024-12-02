public class Joc {
    Echipa e1, e2;
    Minge minge;
    private String scor = "0:0";
    private static final int X_START = 50, Y_START = 25, NUMAR_SUTURI = 1000;

    public Joc(String numeEchipa1, String numeEchipa2){
        e1 = new Echipa(numeEchipa1);
        e2 = new Echipa(numeEchipa2);
    }

    public void anunt(){
        System.out.println(e1.getNume() + " - " + e2.getNume() + " : Mingea se afla la coordonatele: " + minge);
    }

    public void actualizeazaScor(){
        scor = e1.getNumarGoluri() + ":" + e2.getNumarGoluri();
    }

    public String toString(){
        return e1 + "\n" + e2 + "\nScor: " + scor;
    }

    public void simuleaza(){
        CoordinateGenerator cg = new CoordinateGenerator();
        minge = new Minge(X_START, Y_START);
        int X_VECHI = X_START, Y_VECHI = Y_START;
        for(int i = 0; i < NUMAR_SUTURI; i++) {
            Echipa echipa;
            if(i % 2 == 0)
                echipa = e1;
            else
                echipa = e2;
            System.out.println(echipa.getNume() + ":");
            try {
                System.out.println("Sut");
                X_VECHI = minge.getX(); Y_VECHI = minge.getY();
                minge.suteaza(cg.generateX(), cg.generateY());
            } catch (Gol e) {
                System.out.println("Gol: " + minge);
                echipa.gol();
                minge = new Minge(X_START, Y_START);
                X_VECHI = minge.getX(); Y_VECHI = minge.getY();
                actualizeazaScor();
            } catch (Out e) {
                System.out.println("Out: " + minge);
                echipa.out();
                minge = new Minge(X_VECHI, Y_VECHI);
            } catch (Corner e) {
                System.out.println("Corner: " + minge);
                echipa.corner();
                minge.mutaInColt();
                X_VECHI = minge.getX(); Y_VECHI = minge.getY();
            } finally {
                anunt();
            }
        }
    }

    public static void main(String[] args) {
        Joc joc = new Joc("Real Madrid", "Metalurgistul Cugir");
        joc.simuleaza();
        System.out.println(joc);
    }
}