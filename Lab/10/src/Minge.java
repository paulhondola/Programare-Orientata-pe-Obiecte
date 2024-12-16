class Minge {
    // Parametrii
    private static final int X_START = 50, Y_START = 25;
    private static final int X_POARTA_STANGA = 0, X_POARTA_DREAPTA = 100;
    private static final int Y_GOL_JOS = 20, Y_GOL_SUS = 30;
    private static final int Y_OUT_JOS = 0, Y_OUT_SUS = 50;
    private int x, y;

    public Minge() {
        this.x = X_START;
        this.y = Y_START;
    }

    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private boolean verificaPoarta() {
        return x == X_POARTA_STANGA || x == X_POARTA_DREAPTA;
    }

    private boolean verificaOut() {
        return y == Y_OUT_JOS || y == Y_OUT_SUS;
    }

    private boolean verificaGol() {
        return verificaPoarta() && y >= Y_GOL_JOS && y <= Y_GOL_SUS;
    }

    private boolean verificaCorner() {
        return verificaPoarta() && (verificaCornerJos() || verificaCornerSus());
    }

    private boolean verificaCornerSus() {
        return y > Y_GOL_SUS && y < Y_OUT_SUS;
    }

    private boolean verificaCornerJos() {
        return y < Y_GOL_JOS && y > Y_OUT_JOS;
    }

    public void mutaInColt() {
        if (verificaCornerJos())
            y = Y_OUT_JOS;
        else if (verificaCornerSus())
            y = Y_OUT_SUS;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void suteaza(int x, int y) throws Gol, Out, Corner {
        int X_VECHI = this.x, Y_VECHI = this.y;
        this.x = x;
        this.y = y;

        String message = " la pozitia: " + "(" + x + ", " + y + ")";
        if (verificaGol()) {
            this.x = X_START;
            this.y = Y_START;
            throw new Gol("Gol" + message);
        } else if (verificaOut()) {
            this.x = X_VECHI;
            this.y = Y_VECHI;
            throw new Out("Out" + message);
        } else if (verificaCorner()) {
            mutaInColt();
            throw new Corner("Corner" + message);
        }
    }
}