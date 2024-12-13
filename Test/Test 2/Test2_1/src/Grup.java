import java.util.LinkedList;
import java.util.List;
public class Grup extends Destinatar{
    private List<Destinatar> membri = new LinkedList<>();

    public Grup(String nume){
        super(nume);
    }

    public void inscrie(Destinatar d) throws DestinatarDuplicat{
        if(membri.contains(d))
            throw new DestinatarDuplicat("Destinatarul " + d.getNume() + " este deja in grupul " + this.getNume());

        membri.add(d);
    }

    @Override
    public void receptioneaza(Utilizator u, String mesaj){
        for(Destinatar d : membri){
            d.receptioneaza(u, mesaj);
        }
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Grup g)){
            return false;
        }

        return this.getNume().equals(g.getNume());
    }

    @Override
    public String toString(){
        String s = this.getNume() + ":\n";
        for(Destinatar d : membri){
            s += d.getNume() + "\n";
        }
        return s;
    }
}
