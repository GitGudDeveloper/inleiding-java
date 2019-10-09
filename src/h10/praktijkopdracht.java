package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijkopdracht extends Applet {
    String beoordeling;
    String ingevoerd;
    String waarschuwing;
    TextField tekstvak;
    Label label;
    double cijfer;


    public void init() {
        setSize(400, 400);
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new tekstvaklistener());
        label = new Label("voer je cijfer in en druk op enter voor een beoordeling.");
        add(tekstvak);
        add(label);
        beoordeling = "";
        ingevoerd = "";
        waarschuwing = "Er is een verkeerd cijfer ingevoerd!";

    }

    public void paint(Graphics g) {
        g.drawString(beoordeling, 30, 100);

    }

    private class tekstvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ingevoerd = tekstvak.getText();
            cijfer =Integer.parseInt(ingevoerd);
            if ((cijfer == 1) || (cijfer == 2) || (cijfer == 3)) {
                beoordeling = "slecht";

            } else { if (cijfer == 4) {
                beoordeling = "onvoldoende";
            } else { if (cijfer == 5) {
                beoordeling = "matig";
            } else {
                if ((cijfer == 6) || (cijfer == 7)) {
                    beoordeling = "voldoende";
                } else {
                    if ((cijfer == 8) || (cijfer == 9) || (cijfer == 10)) {
                        beoordeling = "goed";
                    } else {
                        beoordeling = waarschuwing;
                    }

                }


            }
            }
            } repaint();
        }
    }
}