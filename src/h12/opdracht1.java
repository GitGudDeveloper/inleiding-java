package h12;


import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {
    double[] cijfers;
    double totaal;
    double gemiddelde;


    public void init() {
        cijfers = new double[10];
        cijfers [0] = 5.0;
        cijfers [1] = 5.1;
        cijfers [2] = 5.2;
        cijfers [3] = 5.3;
        cijfers [4] = 5.4;
        cijfers [5] = 5.5;
        cijfers [6] = 5.6;
        cijfers [7] = 5.7;
        cijfers [8] = 5.8;
        cijfers [9] = 5.9;
        totaal = (cijfers[0] + cijfers[1] + cijfers[2] + cijfers[3] + cijfers[4] + cijfers[5] + cijfers[6] + cijfers[7] + cijfers[8] + cijfers[9]);
        gemiddelde = totaal / cijfers.length;

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < cijfers.length; teller++) {
            g.drawString("" + cijfers[teller], 50, 20 * teller + 20);



        }
        g.drawString("Het gemiddelde = " + gemiddelde, 150, 220 );
    }
}
