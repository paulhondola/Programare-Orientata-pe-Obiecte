public class Main {
    public static void main(String[] args) {

        Pluton p1 = new Pluton();

        p1.adauga(new Arcas());

        p1.adauga(new Arcas());
        p1.adauga(new Arcas());
        p1.adauga(new Arcas());

        Pluton p2 = new Pluton();

        p2.adauga(new Calaret());

        Pluton p21 = new Pluton();

        p21.adauga(new Arcas());
        p21.adauga(new Arcas());
        p2.adauga(p21);

        while(p1.esteVie() && p2.esteVie()){
            if(Math.random() > 0.5){
                p1.loveste(p2);
                System.out.println("p1 loveste p2");
            } else {
                p2.loveste(p1);
                System.out.println("p2 loveste p1");
            }
        }


    }
}