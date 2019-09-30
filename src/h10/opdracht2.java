package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {
    boolean startgetal;
    int ingevoerdgetal;
    int maxlimiet;
    int minlimiet;
    TextField tekstvak;
    Label label;
    String tekst;
    String tekst2;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";
        tekst2 = "";

        label = new Label("het hoogste cijfer wordt onthouden");

        add(label);
        add(tekstvak);
        startgetal = true;

    }


    public void paint(Graphics g) {
        g.drawString("maximum: " + tekst, 50, 50);
        g.drawString("minimum: " + tekst2, 50, 100);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String ingevoerdgetalString = tekstvak.getText();
            ingevoerdgetal = Integer.parseInt(ingevoerdgetalString);
            if (startgetal) {
                startgetal = false;
                maxlimiet = ingevoerdgetal;
                minlimiet = ingevoerdgetal;
                tekst = String.valueOf(maxlimiet);
                tekst2 = String.valueOf(minlimiet);
                repaint();
            } else {
                if (ingevoerdgetal > maxlimiet) {
                    maxlimiet = ingevoerdgetal;
                    tekst = String.valueOf(maxlimiet);
                    repaint();


                }else if (ingevoerdgetal < minlimiet) {
                minlimiet = ingevoerdgetal;
                tekst2 = String.valueOf(minlimiet);
                repaint();
            } else {repaint();}






            }
        }
    }
}



