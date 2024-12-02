class Echipa{

    private String nume;
    private int numarGoluri;
    private int numarCornere;
    private int numarOuturi;

    public Echipa(String nume){
        this.nume = nume;
    }

    public String toString(){
        return nume + " | Goluri: " + numarGoluri + " | Cornere: " + numarCornere + " | Outuri: " + numarOuturi;
    }

    public String getNume(){
        return nume;
    }

    public void gol(){
        numarGoluri++;
    }

    public void corner(){
        numarCornere++;
    }

    public void out(){
        numarOuturi++;
    }

    public int getNumarGoluri() {
        return numarGoluri;
    }
}