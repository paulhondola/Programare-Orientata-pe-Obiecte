public class Utilizator extends Destinatar{
    private String jurnal;

    public Utilizator(String nume){
        super(nume);
        jurnal = "";
    }

    @Override
    public void receptioneaza(Utilizator u, String mesaj){
        if(u.equals(this))
            return;
        jurnal += "Primit de la " + u.getNume() + " mesajul: " + mesaj + "\n";
    }

    public void trimite(Destinatar d, String mesaj){
        jurnal += "Trimis catre " + d.getNume() + " mesajul: " + mesaj + "\n";
        d.receptioneaza(this, mesaj);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Utilizator u)){
            return false;
        }

        return this.getNume().equals(u.getNume());
    }

    @Override
    public String toString(){
        return this.getNume() + ":\n" + jurnal;
    }
}
