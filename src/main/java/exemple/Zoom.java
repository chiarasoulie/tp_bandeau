package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Zoom implements Effect{



    public Zoom() {

    }
    public void effet(Bandeau bandeau) {
        bandeau.setMessage("On va zoomer");
        bandeau.sleep(1000);
        bandeau.setMessage("Je me rapproche !");
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("coucou", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
    }
}
