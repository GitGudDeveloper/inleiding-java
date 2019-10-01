package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {
    TextField tekstvak;
    boolean startgetal;
    int maandnummer;
    String maandnaam;
    Label label;


    public void init() {
        setSize(500, 500);
        tekstvak = new TextField(5);
        tekstvak.addActionListener(new Vaklistener());
        label = new Label("type een maandnummer en druk op enter.");
        add(label);
        add(tekstvak);
        maandnaam = "";



    }


    public void paint(Graphics g) {
        g.drawString(maandnaam, 30, 200);

    }

    private class Vaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String maandnummerString = tekstvak.getText();
            maandnummer = Integer.parseInt(maandnummerString);
            if (startgetal) {
                startgetal = false;
            } else {
                if (maandnummer == 1) {
                    maandnaam = "de maand Januari heeft 31 dagen";
                } else if (maandnummer == 2) {
                    maandnaam = " de maand Februari heeft 29 dagen";
                } else if (maandnummer == 3) {
                    maandnaam = " de maand Maart heeft 31 ";
                } else if(maandnummer == 4) {
                    maandnaam = " de maand April heeft 30 dagen";
                } else if (maandnummer == 5) {
                    maandnaam = " de maand Mei heeft 31 dagen";
                } else if (maandnummer == 6) {
                    maandnaam = " de maand Juni 30 dagen";
                } else if (maandnummer == 7) {
                    maandnaam = " de maand Juli heeft 31 dagen";
                } else if (maandnummer == 8) {
                    maandnaam = " de maand Augustus heeft 31 dagen";
                } else if (maandnummer == 9) {
                    maandnaam = " de maand September heeft 30 dagen";
                } else if (maandnummer == 10) {
                    maandnaam = " de maand Oktober heeft 31 dagen";
                } else if (maandnummer == 11) {
                    maandnaam = " de maand November heeft 30 dagen";
                } else if (maandnummer == 12) {
                    maandnaam = " de maand December heeft 31 dagen";
                } else
                    maandnaam = "";
            } repaint();


        }
    }
}
