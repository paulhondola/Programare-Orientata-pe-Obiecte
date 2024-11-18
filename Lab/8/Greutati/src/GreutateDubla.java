public class GreutateDubla extends Greutate{
    private Greutate g1, g2;

    public GreutateDubla(Greutate g1, Greutate g2){
        this.g1 = g1;
        this.g2 = g2;
    }

    public void setGreutate1(Greutate g1){
        this.g1 = g1;
    }

    public void setGreutate2(Greutate g2){
        this.g2 = g2;
    }

    @Override
    public int capacitate() {
        return g1.capacitate() + g2.capacitate();
    }

    @Override
    public int numarGreutati() {
        return g1.numarGreutati() + g2.numarGreutati();
    }
}
