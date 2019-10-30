package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht8 extends Applet {
    public void init() {
        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        int x = 495;
        int y = 495;
        int width = 10;
        int height = 10;
        for (int c = 0; c<100; c++) {
            x-=5;
            y-=5;
            width+=10;
            height+=10;
            g.drawOval(x, y, width, height);
        }

    }
}
