package h12;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    Button[] knop;
    double gemiddelde;


    public void init() {
        knop = new Button[25];
        knop[0] = new Button();
        knop[1] = new Button();
        knop[2] = new Button();
        knop[3] = new Button();
        knop[4] = new Button();
        knop[5] = new Button();
        knop[6] = new Button();
        knop[7] = new Button();
        knop[8] = new Button();
        knop[9] = new Button();
        knop[10] = new Button();
        knop[11] = new Button();
        knop[12] = new Button();
        knop[13] = new Button();
        knop[14] = new Button();
        knop[15] = new Button();
        knop[16] = new Button();
        knop[17] = new Button();
        knop[18] = new Button();
        knop[19] = new Button();
        knop[20] = new Button();
        knop[21] = new Button();
        knop[22] = new Button();
        knop[23] = new Button();
        knop[24] = new Button();

    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < knop.length; teller++) {
            add(knop[teller]);



        }

    }
}


