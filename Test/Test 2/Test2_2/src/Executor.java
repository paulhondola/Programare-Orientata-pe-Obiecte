import java.util.HashSet;
public class Executor {
    private HashSet<Statistica> statisici = new HashSet<>();

    public Executor(HashSet<Statistica> statisici) {
        this.statisici = statisici;
    }

    public void executa(HashSet<String> secventa) {
        for (Statistica s : this.statisici) {
            s.calculeaza(secventa);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        HashSet<String> secv1 = new HashSet<>(3);
        secv1.add("mere");
        secv1.add("pere");
        secv1.add("banane");
        StatisticaNumarAparitii nrap = new StatisticaNumarAparitii(secv1);
        StatisticaNumeraleNonReale nnonr = new StatisticaNumeraleNonReale();

        HashSet<Statistica> statisici = new HashSet<>(2);
        statisici.add(nrap);
        statisici.add(nnonr);
        Executor exe = new Executor(statisici);

        HashSet<String> secv2 = new HashSet<>(3);
        HashSet<String> secv3 = new HashSet<>(3);

        secv2.add("Ana");
        secv2.add("are");
        secv2.add("mere");

        secv3.add("Maria");
        secv3.add("are");
        secv3.add("pere");

        exe.executa(secv2);
        exe.executa(secv3);
    }
}
