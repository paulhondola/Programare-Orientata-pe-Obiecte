import java.util.HashSet;
abstract public class Statistica {
    private String jurnal;
    private int numarAparitii;

    abstract public void calculeaza(HashSet<String> secventa);

    protected int setNumarAparitii(int numarAparitii) {
        return this.numarAparitii = numarAparitii;
    }

    protected String setJurnal(String jurnal) {
        return this.jurnal = jurnal;
    }

    public int getNumarAparitii() {
        return numarAparitii;
    }

    public String toString() {
        return jurnal;
    }
}
