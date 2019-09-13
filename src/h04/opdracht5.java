package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100,150,75, 50, 0, 180);
        g.fillArc(100, 150, 75, 50, 180, 180);
    }
}
