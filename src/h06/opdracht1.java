package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

    int totalebedrag;
    int personen;
    int uitkomst;

    public void init() {
        totalebedrag = 113;
        personen = 4;
        uitkomst = totalebedrag / personen;


    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(totalebedrag), 45, 50);
        g.drawString(":", 72, 50);
        g.drawString(String.valueOf(personen), 80, 50);
        g.drawString("=", 90, 50);
        g.drawString(String.valueOf(uitkomst), 100, 50);
        g.drawString("Jan krijgt 28 euro", 45, 75);
        g.drawString("Ali krijgt 28 euro", 45, 90);
        g.drawString("Jeannette krijgt 28 euro", 45, 105);
        g.drawString("Quincy krijgt 28 euro", 45, 120);

    }
}

