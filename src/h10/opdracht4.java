package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht4 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    boolean startgetal;
    int maandnummer;
    int jaartal;
    String datum;
    String schikkeljaar;
    String datumFebruari;
    Label label;
    Label label2;


    public void init() {
        setSize(500, 500);
        tekstvak = new TextField(5);
        tekstvak.addActionListener(new tekstvaklistener());
        label = new Label("type een jaartal en druk op enter om het te bevestigen.");
        add(label);
        add(tekstvak);
        tekstvak2 = new TextField(5);
        tekstvak2.addActionListener(new tekstvak2listener());
        label2 = new Label("type dan een maandnummer en druk op enter.");
        add(label2);
        add(tekstvak2);

        schikkeljaar = "";
        datum = "";
        datumFebruari = "";


    }


    public void paint(Graphics g) {
        g.drawString(datum, 30, 200);
        g.drawString(schikkeljaar, 30, 180);

    }







    private class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String jaartalString = tekstvak.getText();
            jaartal = Integer.parseInt(jaartalString);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0) {
                schikkeljaar = "het jaar " + jaartal + " is een schikkeljaar";
                datumFebruari = " de maand Februari heeft 30 dagen.";
            } else {
                schikkeljaar = "het jaar " + jaartal + " is geen schikkeljaar";
                datumFebruari = " de maand Februari heeft 29 dagen.";


            } repaint();
    }



        }

    private class tekstvak2listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String maandnummerString = tekstvak2.getText();
            maandnummer = Integer.parseInt(maandnummerString);
            if (startgetal) {
                startgetal = false;
            } else {
                if (maandnummer == 1) {
                    datum = "de maand Januari heeft 31 dagen.";
                } else if (maandnummer == 2) {
                    datum = datumFebruari;
                } else if (maandnummer == 3) {
                    datum = " de maand Maart heeft 31 dagen.";
                } else if (maandnummer == 4) {
                    datum = " de maand April heeft 30 dagen.";
                } else if (maandnummer == 5) {
                    datum = " de maand Mei heeft 31 dagen.";
                } else if (maandnummer == 6) {
                    datum = " de maand Juni 30 dagen.";
                } else if (maandnummer == 7) {
                    datum = " de maand Juli heeft 31 dagen.";
                } else if (maandnummer == 8) {
                    datum = " de maand Augustus heeft 31 dagen.";
                } else if (maandnummer == 9) {
                    datum = " de maand September heeft 30 dagen.";
                } else if (maandnummer == 10) {
                    datum = " de maand Oktober heeft 31 dagen.";
                } else if (maandnummer == 11) {
                    datum = " de maand November heeft 30 dagen.";
                } else if (maandnummer == 12) {
                    datum = " de maand December heeft 31 dagen.";
                } else
                    datum = "";
            }
            repaint();

        }
    }
}








