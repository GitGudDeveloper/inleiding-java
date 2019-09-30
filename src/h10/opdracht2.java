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
    String excuses;

    public void init() {
        setSize(700, 400);
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";
        tekst2 = "";

        label = new Label("alleen het hoogst ingevoerde cijer (maximum) en het laagst ingevoerde cijfer (minimum) worden onthouden");

        add(label);
        add(tekstvak);
        startgetal = true;

    }


    public void paint(Graphics g) {
        g.drawString("maximum: " + tekst, 50, 50);
        g.drawString("minimum: " + tekst2, 50, 100);
        g.drawString(excuses, 50, 300);
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
                    excuses = "";
                    tekst = String.valueOf(maxlimiet);
                    repaint();


                }else if (ingevoerdgetal < minlimiet) {
                minlimiet = ingevoerdgetal;
                excuses = "";
                tekst2 = String.valueOf(minlimiet);
                repaint();
            } else
                excuses = "het ingevoerde cijfer ligt niet onder het minimum of boven het maximum!";
                {repaint();}






            }
        }
    }
}



