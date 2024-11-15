class Inmultire extends ExpresieBinara{

    public Inmultire(Expresie stanga, Expresie dreapta) {
        super(stanga, dreapta);
    }

    @Override
    public String toString() {

        Expresie prod = checkIfProductWithZero();
        if(prod != null)
            return prod.toString();

        prod = checkIfProductWithOne();
        if(prod != null)
            return prod.toString();

        return "(" + stanga + " * " + dreapta + ")";
    }

    private Expresie checkIfProductWithOne() {
        if(stanga instanceof Constanta && ((Constanta)stanga).getValoare() == 1)
            return dreapta;
        if(dreapta instanceof Constanta && ((Constanta)dreapta).getValoare() == 1)
            return stanga;
        return null;
    }

    private Expresie checkIfProductWithZero()
    {
        if(stanga instanceof Constanta && ((Constanta)stanga).getValoare() == 0)
            return new Constanta(0);
        if(dreapta instanceof Constanta && ((Constanta)dreapta).getValoare() == 0)
            return new Constanta(0);
        return null;
    }

    @Override
    public Suma derivata(){
        return new Suma(new Inmultire(stanga.derivata(), dreapta), new Inmultire(stanga, dreapta.derivata()));
    }
}
