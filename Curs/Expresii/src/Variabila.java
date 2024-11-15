class Variabila extends Expresie {

    @Override
    public Constanta derivata() {
        return new Constanta(1);
    }

    @Override
    public String toString() {
        return "x";
    }
}
