package h06;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;


    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde = gemiddelde * 10;
        gemiddelde = (int) gemiddelde;
        gemiddelde = gemiddelde / 10;

    }


    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is:", 20, 50);
        g.drawString(String.valueOf(gemiddelde), 130, 50);
    }
}
