import java.util.ArrayList;
import java.util.HashSet;

public class StatisticaNumarAparitii extends Statistica{
    private HashSet<String> secventa;

    public StatisticaNumarAparitii(HashSet<String> secventa) {
        super();
        this.secventa = secventa;
    }

    @Override
    public void calculeaza(HashSet<String> secventa) {
        for(String s : secventa)
            if (this.secventa.contains(s))
                setNumarAparitii(getNumarAparitii() + 1);

        actualizeazaJurnal(secventa.toString());
        setNumarAparitii(0);
    }

    private void actualizeazaJurnal(String secventa) {
        String jurnalActualizat = "In secventa " + secventa + " apar " + getNumarAparitii() + " elemente din secventa " + this.secventa + "\n";
        setJurnal(jurnalActualizat);
    }

    public static void main(String[] args) {
        HashSet<String> secventa = new HashSet<>(8);
        String ana = "ana";
        String are = "are";
        String mere = "mere";

        secventa.add(ana);
        secventa.add(are);
        secventa.add(mere);

        secventa.add("ana");
        secventa.add("are");
        secventa.add("mere");

        HashSet<String> secventa2 = new HashSet<>(4);
        secventa2.add("ana");
        secventa2.add("are");
        secventa2.add("prune");
        secventa2.add("mere");

        StatisticaNumarAparitii statistica = new StatisticaNumarAparitii(secventa);
        statistica.calculeaza(secventa2);
        System.out.println(statistica);
    }
}
