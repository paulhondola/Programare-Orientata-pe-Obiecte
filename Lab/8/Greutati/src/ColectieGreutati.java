public class ColectieGreutati extends Greutate{
    private Greutate[] greutati;
    private int nrGreutati;
    private int nrMaxGreutati;

    public ColectieGreutati(int nrMaxGreutati){
        this.nrMaxGreutati = nrMaxGreutati;
        greutati = new Greutate[nrMaxGreutati];
        nrGreutati = 0;
    }

    public void adauga(Greutate g) {
        if(nrGreutati >= nrMaxGreutati)
            return;

        greutati[nrGreutati++] = g;
    }

    @Override
    public int capacitate() {
        int capacitate = 0;
        for(int i = 0; i < nrGreutati; i++){
            capacitate += greutati[i].capacitate();
        }
        return capacitate;
    }

    @Override
    public int numarGreutati() {
        int numarGreutati = 0;
        for(int i = 0; i < nrGreutati; i++){
            numarGreutati += greutati[i].numarGreutati();
        }
        return numarGreutati;
    }

    public double medie(){
        return capacitate() / (double) numarGreutati();
    }
}
