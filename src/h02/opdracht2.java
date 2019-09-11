package h02;

import java.applet.Applet;
import java.awt.*;


public class opdracht2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() { setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Quincy", 50, 60);
        g.setColor(Color.red);
        g.drawString("van", 50 ,80 );
        g.drawString("Kempen", 50, 100);
    }
}

