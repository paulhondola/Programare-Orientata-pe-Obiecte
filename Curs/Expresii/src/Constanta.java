class Constanta extends Expresie {

    private double valoare;

    public Constanta(double valoare) {
        this.valoare = valoare;
    }

    public double getValoare() {
        return valoare;
    }

    @Override
    public Constanta derivata() {
        return new Constanta(0);
    }

    @Override
    public String toString() {
        return "" + valoare;
    }
}
