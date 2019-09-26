package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {

    TextField tekstvak1;
    TextField tekstvak2;
    Button plusknop;
    Button minknop;
    Button keerknop;
    Button deelknop;
    String s;
    int getal1;
    int getal2;



    public void init() {

        s = "";

        tekstvak1 = new TextField("", 15);
        tekstvak1.addActionListener(new tekstvak1Listener());
        add(tekstvak1);

        tekstvak2 = new TextField("", 15);
        add(tekstvak2);

        plusknop = new Button("+");
        plusknop.addActionListener(new plusknoplistener());
        add(plusknop);

        minknop = new Button("-");
        minknop.addActionListener(new minknoplistener());
        add(minknop);

        keerknop = new Button("*");
        keerknop.addActionListener(new keerknoplistener());
        add(keerknop);

        deelknop = new Button("/");
        deelknop.addActionListener(new deelknoplistener());
        add(deelknop);

    }

    private class plusknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt(s1);
            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt(s2);
            tekstvak1.setText(String.valueOf(getal1 + getal2));
            tekstvak2.setText("");
            repaint();


        }
    }

    private class minknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt(s1);
            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt(s2);
            tekstvak1.setText(String.valueOf(getal1 - getal2));
            tekstvak2.setText("");
            repaint();

        }
    }

    private class keerknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt(s1);
            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt(s2);
            tekstvak1.setText(String.valueOf(getal1 * getal2));
            tekstvak2.setText("");
            repaint();

        }
    }

    private class deelknoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            getal1 = Integer.parseInt(s1);
            String s2 = tekstvak2.getText();
            getal2 = Integer.parseInt(s2);
            tekstvak1.setText(String.valueOf(getal1 / getal2));
            tekstvak2.setText("");
            repaint();
        }
    }

    private class tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
