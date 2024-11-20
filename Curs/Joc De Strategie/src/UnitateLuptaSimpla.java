public abstract class UnitateLuptaSimpla implements UnitateLupta {
    private int viata;
    private int putere;

    public UnitateLuptaSimpla(int viata, int putere) {
        this.viata = viata;
        this.putere = putere;
    }

    public boolean esteVie() {
        return viata > 0;
    }

    public void ranire(int daune) {
        if(esteVie()) {
            viata -= daune;
        }
    }

    public void loveste(UnitateLupta unitate) {
        unitate.ranire(putere);
    }
}
