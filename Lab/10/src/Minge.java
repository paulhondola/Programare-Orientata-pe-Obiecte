class Minge{
    private int x, y;

    // Parametrii
    private final int X_POARTA_STANGA = 0, X_POARTA_DREAPTA = 100;
    private final int Y_GOL_JOS = 20, Y_GOL_SUS = 30;
    private final int Y_OUT_JOS = 0, Y_OUT_SUS = 50;

    public Minge(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    private boolean verificaPoarta(){
        return x == X_POARTA_STANGA || x == X_POARTA_DREAPTA;
    }

    private boolean verificaOut(){
        return y == Y_OUT_JOS || y == Y_OUT_SUS;
    }

    private boolean verificaGol(){
        return verificaPoarta() && y >= Y_GOL_JOS && y <= Y_GOL_SUS;
    }

    private boolean verificaCorner(){
        return verificaPoarta() && (verificaCornerJos() || verificaCornerSus());
    }

    private boolean verificaCornerSus() {
        return y > Y_GOL_SUS && y < Y_OUT_SUS;
    }

    private boolean verificaCornerJos() {
        return y < Y_GOL_JOS && y > Y_OUT_JOS;
    }

    public void mutaInColt(){
        if(verificaCornerJos())
            y = Y_OUT_JOS;
        else if (verificaCornerSus())
            y = Y_OUT_SUS;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public void suteaza(int x, int y) throws Gol, Out, Corner{
        this.x = x;
        this.y = y;

        if(verificaGol()) throw new Gol("Gol la pozitia: " + this);
        if(verificaOut()) throw new Out("Out la pozitia: " + this);
        if(verificaCorner()) throw new Corner("Corner la pozitia: " + this);
    }
}