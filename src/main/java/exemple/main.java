package exemple;
import bandeau.Bandeau;


public class main {
    public static void main(String[] args) {
        Bandeau b = new Bandeau();
        Scénario s = new Scénario(b);
        Rotation r = new Rotation("Je tooooouuuurne !");
        Arc_En_Ciel a = new Arc_En_Ciel("Licorne");
        Zoom z = new Zoom();

        s.ajouterEffet(a, 2);
        s.ajouterEffet(z,2);


        s.demarrerScenario();


    }
}

