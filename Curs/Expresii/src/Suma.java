class Suma extends ExpresieBinara{

    public Suma(Expresie stanga, Expresie dreapta) {
        super(stanga, dreapta);
    }

    @Override
    public String toString() {
        Expresie sum = checkIfSumWithZero();
        if(sum != null)
            return sum.toString();

        sum = checkIfSumBetweenConstants();
        if(sum != null)
            return sum.toString();

        return "(" + stanga + " + " + dreapta + ")";
    }

    private Expresie checkIfSumBetweenConstants() {
        if(stanga instanceof Constanta && dreapta instanceof Constanta)
            return new Constanta(((Constanta)stanga).getValoare() + ((Constanta)dreapta).getValoare());
        return null;
    }

    private Expresie checkIfSumWithZero() {
        if(stanga instanceof Constanta && ((Constanta)stanga).getValoare() == 0)
            return dreapta;
        if(dreapta instanceof Constanta && ((Constanta)dreapta).getValoare() == 0)
            return stanga;
        return null;
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
