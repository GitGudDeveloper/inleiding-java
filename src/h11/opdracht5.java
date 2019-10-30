package h11;


import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {
    public void init() {
        setSize(700, 700);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;
        for (int r = 0; r<5; r++) {
            x+=50;
            y+=50;
            g.drawRect(x, y, width, height);
        }




    }
}
