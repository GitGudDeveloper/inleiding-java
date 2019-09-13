package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.white);
        //lijnen
        g.setColor(Color.black);
        g.drawLine(75, 55, 75, 180);
        g.drawLine(75, 180, 265, 180);
        g.drawLine(75, 155, 65, 155);
        g.drawLine(75, 130, 65, 130);
        g.drawLine(75, 105, 65, 105);
        g.drawLine(75, 80, 65, 80);
        g.drawLine(75, 55, 65, 55);
        //getallen
        g.drawString("gewicht in Kg", 10, 25);
        g.drawString("0", 60, 185);
        g.drawString("20", 50, 160);
        g.drawString("40", 50, 135);
        g.drawString("60", 50, 110);
        g.drawString("80", 50, 85);
        g.drawString("100", 45, 60);
        //staven staafdiagram
        g.setColor(Color.blue);
        g.fillRect(85, 130, 40, 50);
        g.setColor(Color.green);
        g.fillRect(140, 80, 40, 100);
        g.setColor(Color.red);
        g.fillRect(195, 55, 40, 125);
        //De namen van de kinderen
        g.setColor(Color.black);
        g.drawString("Valerie", 85, 192);
        g.drawString("Hans", 140, 192);
        g.drawString("Jeroen", 195, 192);
    }
}
