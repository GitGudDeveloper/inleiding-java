package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht2 extends Applet {
    Button vrouwen;
    Button mannen;
    Button vrouwelijkeleerlingen;
    Button mannelijkeleerlingen;
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    int bijkomstvrouwen;
    int bijkomstmannen;
    int bijkomstmeisjes;
    int bijkomstjongens;
    int bijkomsttotaal;




    public void init() {
        setSize(600, 600);

        bijkomstvrouwen = 0;
        bijkomstmannen = 0;
        bijkomstmeisjes = 0;
        bijkomstjongens = 0;
        bijkomsttotaal = 0;

        //knoppen
        vrouwen = new Button("vrouwen");
        vrouwen.addActionListener(new vrouwenlistener());
        add(vrouwen);

        mannen = new Button("mannen");
        mannen.addActionListener(new mannenlistener());
        add(mannen);

        vrouwelijkeleerlingen = new Button("meisjes");
        vrouwelijkeleerlingen.addActionListener(new vrouwelijkeleerlingenlistener());
        add(vrouwelijkeleerlingen);

        mannelijkeleerlingen = new Button("jongens");
        mannelijkeleerlingen.addActionListener(new mannelijkeleerlingenlistener());
        add(mannelijkeleerlingen);



        //tekstvakken
        tekstvak1 = new TextField(10);
        add(tekstvak1);
        tekstvak2 = new TextField(10);
        add(tekstvak2);
        tekstvak3 = new TextField(10);
        add(tekstvak3);
        tekstvak4 = new TextField(10);
        add(tekstvak4);
        tekstvak5 = new TextField(10);
        add(tekstvak5);



    }

    private class vrouwenlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bijkomstvrouwen++;
            bijkomsttotaal++;
            tekstvak1.setText(String.valueOf(bijkomstvrouwen));
            tekstvak5.setText(String.valueOf(bijkomsttotaal));



        }
    }

    private class mannenlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bijkomstmannen++;
            bijkomsttotaal++;
            tekstvak2.setText(String.valueOf(bijkomstmannen));
            tekstvak5.setText(String.valueOf(bijkomsttotaal));

        }
    }

    private class vrouwelijkeleerlingenlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bijkomstmeisjes++;
            bijkomsttotaal++;
            tekstvak3.setText(String.valueOf(bijkomstmeisjes));
            tekstvak5.setText(String.valueOf(bijkomsttotaal));

        }
    }

    private class mannelijkeleerlingenlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bijkomstjongens++;
            bijkomsttotaal++;
            tekstvak4.setText(String.valueOf(bijkomstjongens));
            tekstvak5.setText(String.valueOf(bijkomsttotaal));

        }
    }
}
