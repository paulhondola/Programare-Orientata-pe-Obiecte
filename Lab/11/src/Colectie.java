import java.util.ArrayList;
import java.util.Iterator;

public class Colectie implements Tip{
    private ArrayList<Tip> colectie = new ArrayList<>();

    public Colectie(Tip... t){
        for(Tip tip : t){
            colectie.add(tip);
        }
    }

    @Override
    public String getTip() {
        return "Tip: " + this.getClass().getName();
    }

    @Override
    public String toString() {
        return "Colectie: " + colectie;
    }

    public void add(Tip t){
        colectie.add(t);
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Colectie c)){
            return false;
        }

        // verificare marime
        if(c.colectie.size() != this.colectie.size()){
            return false;
        }

        // verificare egalitate element cu element
        Iterator it1 = this.colectie.iterator();
        Iterator it2 = c.colectie.iterator();

        while(it1.hasNext()){
            if(!it1.next().equals(it2.next())){
                System.out.println(it1);
                System.out.println(it2);
                return false;
            }
        }

        return true;
    }
}
