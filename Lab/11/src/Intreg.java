public class Intreg extends Tip {
    private int valoare;

    public Intreg(int valoare) {
        this.valoare = valoare;
    }

    @Override
    public String getTip() {
        return "Tip: " + this.getClass().getName();
    }

    @Override
    public String toString() {
        return Integer.toString(valoare);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Intreg)){
            return false;
        }

        return this.valoare == ((Intreg) o).valoare;
    }

    public static void main(String[] args) {
        Intreg i = new Intreg(5);
        System.out.println(i.getTip());
        System.out.println(i.toString());
    }
}
