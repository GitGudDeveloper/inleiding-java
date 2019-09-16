package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {
    int a;
    int b;
    int uitkomst;


    public void init() {
        a = 2147483647;
        b = 2147483647;
        uitkomst = a + b;

    }

    public void paint(Graphics g) {
        g.drawString(String.valueOf(uitkomst), 30, 30);
    }
}
