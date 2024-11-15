class Suma extends ExpresieBinara{

    public Suma(Expresie stanga, Expresie dreapta) {
        super(stanga, dreapta);
    }

    @Override
    public String toString() {
        return "(" + stanga + " + " + dreapta + ")";
    }

    @Override
    public Expresie derivata(){
        Expresie s1 = stanga.derivata();
        Expresie s2 = dreapta.derivata();

        if(s1 instanceof Constanta && ((Constanta)s1).getValoare() == 0)
            return s2;

        if(s2 instanceof Constanta && ((Constanta)s2).getValoare() == 0)
            return s1;

        return new Suma(s1, s2);
    }
}
