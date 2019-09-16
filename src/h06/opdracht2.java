package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    int seconde;
    int uur;
    int dag;
    int jaar;

    public void init() {
        seconde = 1;
        uur = 1 * 60 * 60;
        dag = 1 * 60 * 60 * 24;
        jaar = 1 * 60 * 60 * 24 * 365;


    }
    public void paint(Graphics g) {
        //seconden in 1 uur
        g.drawString("er gaan", 20, 30);
        g.drawString(String.valueOf(uur), 70, 30);
        g.drawString("seconden in een uur", 140, 30);
        //seconden in 1 dag
        g.drawString("er gaan", 20, 60);
        g.drawString(String.valueOf(dag), 70, 60);
        g.drawString("seconden in een dag", 140, 60);
        //seconden in 1 jaar
        g.drawString("er gaan", 20, 90);
        g.drawString(String.valueOf(jaar), 70, 90);
        g.drawString("seconden in een jaar", 140, 90);



    }
}
