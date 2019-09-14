package h04;

import java.applet.Applet;
import java.awt.*;

public class praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //de vormen
        g.drawLine(10, 20, 210, 20);
        g.drawRect(10, 80, 200, 100);
        g.drawRoundRect(10, 210, 200, 100, 30, 30 );
        g.setColor(Color.magenta);
        g.fillRect(240, 80, 200, 100);
        g.setColor(Color.black);
        g.drawOval(240, 80, 200, 100);
        g.drawOval(460, 80, 200, 100);
        g.drawOval(510, 210, 100, 100);
        g.setColor(Color.magenta);
        g.fillOval(240, 210, 200, 100);
        g.fillArc(460, 80, 200, 100, 0, 45);
        //het tekst
        g.setColor(Color.black);
        g.drawString("Lijn", 100, 40);
        g.drawString("Rechthoek", 85, 200);
        g.drawString("Gevulde rechthoek met ovaal", 260, 200);
        g.drawString("Taartpunt met ovaal eromheen", 480, 200);
        g.drawString("Afgeronde rechthoek", 50, 330);
        g.drawString("Gevulde ovaal", 300, 330);
        g.drawString("Cirkel", 545, 330);


    }
}
