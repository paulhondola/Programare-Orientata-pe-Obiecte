public class Intreg implements Tip {
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
        if(!(o instanceof Intreg i)){
            return false;
        }

        return this.valoare == i.valoare;
    }

    public static void main(String[] args) {
        Intreg i = new Intreg(5);
        System.out.println(i.getTip());
        System.out.println(i);
    }
}
