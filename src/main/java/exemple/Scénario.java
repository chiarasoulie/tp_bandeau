package exemple;

import bandeau.Bandeau;

import java.util.*;

public class Scénario {
    private HashMap<Effect, Integer> lesEffets;
    private Bandeau bandeau;

    public Scénario(Bandeau bandeau) {
        this.bandeau = bandeau;
        this.lesEffets = new HashMap<>();
    }
    public void ajouterEffet(Effect e, int nbRep){
        lesEffets.put(e, nbRep);
    }
    public void demarrerScenario(){
        for(Map.Entry<Effect, Integer> entry : this.lesEffets.entrySet()){
            for(int i = 0; i < entry.getValue(); i++){
                entry.getKey().effet(bandeau);
            }
        }
        bandeau.close();
    }
}
