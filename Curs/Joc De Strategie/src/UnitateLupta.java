public abstract class UnitateLupta {
    private int viata;

    public void ranire(int daune) {
        viata -= daune;
    }

    public int getViata() {
        return viata;
    }

    public boolean esteVie() {
        return viata > 0;
    }
}
