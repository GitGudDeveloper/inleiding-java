package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht1 extends Applet {
    Button knopOk;
    Button knopReset;
    TextField tekstvak;
    String message;



    public void init() {
        setSize( 600, 600);
        tekstvak = new TextField(20);
        add(tekstvak);
        knopOk = new Button("ok");
        knopOk.addActionListener(new knopOklistener());
        add(knopOk);

        knopReset = new Button("reset");
        knopReset.addActionListener(new knopResetlistener());
        add(knopReset);

        message = "deze is nog leeg.";




    }

    private void add(String tekstvak) {
    }


    public void paint(Graphics g) {
        g.drawString(message, 20, 150);

    }
        class knopOklistener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                message = tekstvak.getText();
                repaint();

            }
        }
        class knopResetlistener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                tekstvak.setText("");

            }
        }


    private class KnopListener {
    }

    private class tekstField {
    }
}
