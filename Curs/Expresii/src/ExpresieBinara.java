abstract class ExpresieBinara extends Expresie {
    protected Expresie stanga, dreapta;

    protected ExpresieBinara(Expresie stanga, Expresie dreapta) {
        this.stanga = stanga;
        this.dreapta = dreapta;
    }

    public abstract Expresie derivata();
}
