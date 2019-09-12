package h04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.Applet;

public class opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(20, 120, 110, 20);
        g.drawLine(20, 120, 200, 120);
        g.drawLine(110, 20, 200, 120);

    }
}
