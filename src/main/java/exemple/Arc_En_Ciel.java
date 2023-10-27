package exemple;
import bandeau.Bandeau;
import java.awt.Color;
import java.util.ArrayList;


public class Arc_En_Ciel implements Effect {

    // texte qui change de couleurs
    private final java.util.List<Color> colors;
    private String message;

    public Arc_En_Ciel (String message){
        this.message = message;

        colors = new ArrayList<>();
        for (int i = 0; i< 25;i++){
            float h = ((float)i) /((float) 25);
            colors.add(new Color(Color.HSBtoRGB(h,1.0f,1.0f)));
        }

    }

    public void effet(Bandeau b){
        b.setMessage(message);
        for (Color c : colors){
            b.setForeground(c);
            b.sleep(300);
        }
    }

}
