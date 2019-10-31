package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {
    public void init() {
        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        int x = 5;
        int y = 5;
        int width = 10;
        int height = 10;
        for (int c = 0; c<100; c++) {
            width+=10;
            height+=10;
            g.drawOval(x, y, width, height);
        }

    }
}
