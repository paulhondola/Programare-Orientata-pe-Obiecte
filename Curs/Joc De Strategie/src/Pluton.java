import java.util.Arrays;

public class Pluton implements UnitateLupta {

    private UnitateLupta []unitati = new UnitateLupta[10];
    private int contor = 0;

    public boolean adauga(UnitateLupta unitate){
        if(!unitate.esteVie()){
            return false;
        }

        if(contor == unitati.length){
            unitati = Arrays.copyOf(this.unitati, 2 * this.unitati.length);
        }

        this.unitati[contor++] = unitate;
        return true;
    }

    @Override
    public boolean esteVie() {
        if(contor == 0)
            return false;

        for(int i = 0; i < contor; i++){
            if(unitati[i].esteVie())
                return true;
        }

        return false;
    }

    @Override
    public void ranire(int daune) {
        for(int i = 0; i < contor; i++) {
            if (unitati[i].esteVie()) {
                unitati[i].ranire(daune);
                break;
            }
        }
    }

    @Override
    public void loveste(UnitateLupta unitate) {
        for(int i = 0; i < contor; i++){
            if(unitati[i].esteVie()){
                unitati[i].loveste(unitate);
                break;
            }
        }
    }



}
