abstract public class Destinatar {
    private String nume;

    public Destinatar(String nume){
        this.nume = nume;
    }

    abstract public void receptioneaza(Utilizator u, String mesaj);
    abstract public boolean equals(Object o);
    public String getNume(){
        return nume;
    };
    abstract public String toString();
}