package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {
    public void init() {
        setSize(600, 800);
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int tweedeteller;

        for(teller = 1; teller < 11; teller++) {
            x += 20;
            g.drawLine(x , 50, x, 350 );
        }


    }


}
