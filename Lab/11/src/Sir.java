public class Sir extends Tip{
    private String valoare;

    public Sir(String valoare) {
        this.valoare = valoare;
    }

    @Override
    public String getTip() {
        return "Tip: " + this.getClass().getName();
    }

    @Override
    public String toString() {
        return valoare;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Sir)){
            return false;
        }

        return this.valoare.equals(((Sir) o).valoare);
    }

    public static void main(String[] args) {
        Sir s = new Sir("Hello");
        System.out.println(s.getTip());
        System.out.println(s);
    }
}
