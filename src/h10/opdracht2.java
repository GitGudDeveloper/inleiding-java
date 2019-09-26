package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {
    int getal;
    int maxlimiet;
    int minlimiet;
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("het hoogste cijfer wordt onthouden");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            getal = Integer.parseInt(s);
            if (getal > maxlimiet) {
                maxlimiet = getal;
                tekst = String.valueOf(maxlimiet);
            } repaint();
                {


                s = tekstvak2.getText();
                getal = Integer.parseInt(s);
                if (getal < minlimiet) {
                    minlimiet = getal;
                    tekst = String.valueOf(minlimiet);
                } repaint();
            }
        }
    }

}
