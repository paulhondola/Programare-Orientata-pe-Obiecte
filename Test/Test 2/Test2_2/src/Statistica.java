import java.util.HashSet;

abstract public class Statistica {
    private String jurnal = "";
    private int numarAparitii = 0;

    protected void setNumarAparitii(int numarAparitii) {
        this.numarAparitii = numarAparitii;
    }

    protected int getNumarAparitii() {
        return numarAparitii;
    }

    protected String actualizeazaJurnal(String jurnalNou) {
        return jurnal += jurnalNou + "\n";
    }

    abstract public void calculeaza(HashSet<String> secventa);

    public String toString() {
        return jurnal;
    }
}
