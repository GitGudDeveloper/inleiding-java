package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.yellow);
        g.setColor(Color.black);
        g.drawLine(350, 30, 350, 230);
        g.drawLine(340, 30, 340, 230);
        g.drawOval(340, 28, 10, 5);
        g.drawArc(340, 228, 10, 5, 180, 180);
        g.drawLine(340, 50, 350, 50);
        g.drawLine(340, 50, 335, 55);
        g.drawLine(340, 135, 350, 135);
        g.drawLine(340, 135, 335, 130);
        g.drawLine(350, 230, 345, 245);
        g.drawLine(340, 230, 345, 245);
        g.setColor(Color.red);
        g.fillRect(200, 55, 135, 25);
        g.setColor(Color.white);
        g.fillRect(200, 80, 135, 25);
        g.setColor(Color.blue);
        g.fillRect(200, 105, 135, 25);
    }
}
