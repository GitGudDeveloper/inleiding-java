package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht3 extends Applet {

    TextField tekstvak;
    Button knopOK;
    Label label;
    double getal;

    public void init() {

        tekstvak = new TextField("", 20);
        label = new Label("type een bedrag");
        tekstvak.addActionListener(new knopOKlistener());
        add(tekstvak);
        add(label);

        //de ok knop
        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKlistener());
        add(knopOK);




    }

    private class knopOKlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal = Integer.parseInt( s );
            tekstvak.setText(String.valueOf(getal * 1.21));
            repaint();



        }
    }
}
