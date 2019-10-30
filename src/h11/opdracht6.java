package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet {

    public void init() {
        setSize(600,600);


    }

    public void paint(Graphics g) {
        int x = 290;
        int y = 290;
        int width = 20;
        int height = 20;
        for (int c = 0; c<5; c++) {
            x-=10;
            y-=10;
            width+=20;
            height+=20;
            g.drawOval(x, y, width, height);
        }

    }
}
