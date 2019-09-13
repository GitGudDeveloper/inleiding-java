package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(210, 150, 20, 149);
        g.setColor(Color.black);
        g.fillArc(190, 150, 60, 20, 180, 180);
        g.fillRect(190, 60, 60, 100);
        g.fillArc(190, 50, 60, 20, 0, 180);
        g.setColor(Color.red);
        g.fillOval(205, 60, 30, 30);
        g.setColor(Color.yellow);
        g.fillOval(205, 95, 30, 30);
        g.setColor(Color.green);
        g.fillOval(205, 130, 30, 30);
    }
}
