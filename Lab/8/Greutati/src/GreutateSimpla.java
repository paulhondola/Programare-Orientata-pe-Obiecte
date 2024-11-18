public class GreutateSimpla extends Greutate{

    private int capacitate;
    public GreutateSimpla(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public int capacitate() {
        return capacitate;
    }

    @Override
    public int numarGreutati() {
        return 1;
    }
}
