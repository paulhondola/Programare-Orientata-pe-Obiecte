public class GreutateMultipla extends Greutate{

    private Greutate[] greutati;

    public GreutateMultipla(Greutate[] greutati){
        this.greutati = greutati;
    }

    @Override
    public int capacitate() {
        int capacitate = 0;
        for(int i = 0; i < greutati.length; i++){
            capacitate += greutati[i].capacitate();
        }
        return capacitate;
    }

    @Override
    public int numarGreutati() {
        int numarGreutati = 0;
        for(int i = 0; i < greutati.length; i++){
            numarGreutati += greutati[i].numarGreutati();
        }
        return numarGreutati;
    }

    public void setGreutateAtIndex(Greutate g, int index){
        greutati[index] = g;
    }
}
