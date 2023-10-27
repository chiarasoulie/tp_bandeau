package exemple;

import bandeau.Bandeau;
import java.awt.*;

public class Rotation implements Effect{
    private String message;

    public Rotation(String message) {
        this.message = message;
    }

    public void effet(Bandeau bandeau) {
        bandeau.setMessage(message);
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + 2*i));
            bandeau.setRotation(i*Math.PI / 2.0f);
            bandeau.sleep(100);
            bandeau.setRotation((i+1)*Math.PI / 2.0f);
            bandeau.setRotation(0.0f);
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
        bandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        bandeau.setMessage("Terminé");
        bandeau.sleep(3000);
        bandeau.close();
    }
}
