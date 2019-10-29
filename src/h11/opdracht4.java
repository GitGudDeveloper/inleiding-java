package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {
    public void init() {

    }


    public void paint(Graphics g) {
        int getal;
        int drie;
        int uitkomst;
        int y;
        getal = 1;
        drie = 3;
        y = 0;
        for(uitkomst = getal * drie; getal<11; getal++) {
            y += 15;
            uitkomst = getal * drie;
            g.drawString("" + getal + "x" + drie + "=" + uitkomst, 50, y);
        }
    }
}
