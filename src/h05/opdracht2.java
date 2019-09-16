package h05;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    //Declaratie
    int gewichtValerie;
    int gewichtHans;
    int gewichtJeroen;
    int hoogteXas;

        public void init() {
            //initialisatie
            gewichtValerie = 40;
            gewichtHans = 80;
            gewichtJeroen = 100;
            hoogteXas = 180;


        }
    public void paint(Graphics g) {
        setBackground(Color.white);
        //lijnen
        g.setColor(Color.black);
        //verticale as
        g.drawLine(75, 70, 75, 180);
        //horizontale as
        g.drawLine(75, 180, 265, 180);
        g.drawLine(75, 160, 65, 160);
        g.drawLine(75, 140, 65, 140);
        g.drawLine(75, 120, 65, 120);
        g.drawLine(75, 100, 65, 100);
        g.drawLine(75, 80, 65, 80);
        //getallen
        g.drawString("gewicht in Kg", 10, 25);
        g.drawString("0", 60, 180);
        g.drawString("20", 50, 160);
        g.drawString("40", 50, 140);
        g.drawString("60", 50, 120);
        g.drawString("80", 50, 100);
        g.drawString("100", 45, 80);
        //staven staafdiagram
        //staaf Valerie
        g.setColor(Color.blue);
        g.fillRect(85, hoogteXas - gewichtValerie, 40, gewichtValerie);
        //staaf Hans
        g.setColor(Color.green);
        g.fillRect(140, hoogteXas - gewichtHans, 40, gewichtHans);
        //staaf Jeroen
        g.setColor(Color.red);
        g.fillRect(195, hoogteXas - gewichtJeroen, 40, gewichtJeroen);
        //De namen van de kinderen
        g.setColor(Color.black);
        g.drawString("Valerie", 85, 192);
        g.drawString("Hans", 140, 192);
        g.drawString("Jeroen", 195, 192);
    }


}
