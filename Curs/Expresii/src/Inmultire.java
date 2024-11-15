class Inmultire extends ExpresieBinara{

    public Inmultire(Expresie stanga, Expresie dreapta) {
        super(stanga, dreapta);
    }

    @Override
    public Suma derivata(){
        return new Suma(new Inmultire(stanga.derivata(), dreapta), new Inmultire(stanga, dreapta.derivata()));
    }

    @Override
    public String toString() {
        return "(" + stanga + " * " + dreapta + ")";
    }
}
