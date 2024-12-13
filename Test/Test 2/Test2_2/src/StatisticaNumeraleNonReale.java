import java.util.HashSet;
public class StatisticaNumeraleNonReale extends Statistica{

    public StatisticaNumeraleNonReale() {
        super();
    }

    @Override
    public void calculeaza(HashSet<String> secventa) {
        for(String s: secventa) {
            try {
                Double.parseDouble(s);
            } catch(NumberFormatException e){
                setNumarAparitii(getNumarAparitii() + 1);
            }
        }

        actualizeazaJurnal(secventa.toString());
        setNumarAparitii(0);
    }

    private void actualizeazaJurnal(String secventa) {
        String jurnalActualizat = "In secventa " + secventa + " avem " + getNumarAparitii() + " siruri ce nu sunt numere reale\n";
        setJurnal(jurnalActualizat);
    }

    public static void main(String[] args) {
        HashSet<String> secventa = new HashSet<>(8);
        secventa.add("ana");
        secventa.add("are");
        secventa.add("mere");
        secventa.add("1");
        secventa.add("2");
        secventa.add("3");
        secventa.add("4");
        secventa.add("5");

        HashSet<String> secventa2 = new HashSet<>(4);
        secventa2.add("1234");
        secventa2.add("-1234e-2");
        secventa2.add("1234e-2");
        secventa2.add("da");
        secventa2.add("nu");

        StatisticaNumeraleNonReale statistica = new StatisticaNumeraleNonReale();
        statistica.calculeaza(secventa2);
        System.out.println(statistica);
    }
}
