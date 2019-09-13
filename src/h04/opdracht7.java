package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.fillRect(130, 80, 150, 150);
        g.setColor(Color.black);
        g.fillOval(150, 100, 35, 35);
        g.fillOval(150, 175, 35, 35);
        g.fillOval(225, 100, 35, 35);
        g.fillOval(225, 175, 35, 35);

    }
}
