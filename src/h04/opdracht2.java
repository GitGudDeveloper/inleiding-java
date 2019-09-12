package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.darkGray);
        g.drawLine(140, 40, 45, 120);
        g.drawLine(45, 120, 240, 120);
        g.drawLine(240, 120, 140,40);
        g.drawLine(220, 120, 220, 240);
        g.drawLine(220, 240, 65, 240);
        g.drawLine(65, 240, 65, 120);
        g.setColor(Color.orange);
        g.fillRect(95, 185, 30, 55);
        g.setColor(Color.yellow);
        g.fillRect(145, 185, 40, 35);
        g.fillRect(155, 130, 30, 25);

    }

}
