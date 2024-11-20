public class Calaret extends UnitateLuptaSimpla {
    private static final int VIATA = 200;
    private static final int PUTERE = 15;

    private static int nrCai;

    public Calaret() {
        super(VIATA, PUTERE);
    }

    public static int nrCai() {
        return nrCai;
    }

    protected void tocmaiUrmeazaSaMor() {
        nrCai++;
    }
}
