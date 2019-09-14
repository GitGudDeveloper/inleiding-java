package h05;


import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {
        //declaratie.
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;

        public void init() {
            //initialisatie.
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 200;
            hoogte = 100;
        }

        public void paint(Graphics g) {
            g.drawLine(100, 35, 300, 35);
            //teken rechthoek
            g.drawRect(100, 100, breedte, hoogte);
            //teken afgeronde rechthoek
            g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
            //teken gevulde rechthoek
            g.setColor(opvulkleur);
            g.fillRect(315, 100, breedte, hoogte);
            //teken ovaal
            g.setColor(lijnkleur);
            g.drawOval(315, 100, breedte, hoogte);
            //teken gevulde ovaal
            g.setColor(opvulkleur);
            g.fillOval(315, 225, breedte, hoogte);
            // en zo voort...
            g.setColor(lijnkleur);
            g.drawOval(530, 100, breedte, hoogte);
            g.setColor(opvulkleur);
            g.fillArc(530, 100, breedte, hoogte, 0, 45);
            g.setColor(lijnkleur);
            g.drawOval(575, 225, hoogte, hoogte);

            //tekst
            g.drawString("Lijn", 190, 50);
            g.drawString("Rechthoek", 165, 215);
            g.drawString("Gevulde rechthoek met ovaal", 330, 215);
            g.drawString("Taartpunt met ovaal eromheen", 545, 215);
            g.drawString("Afgeronde rechthoek", 145, 342);
            g.drawString("Gevulde ovaal", 375, 342);
            g.drawString("Cirkel", 610, 342);


        }
}
