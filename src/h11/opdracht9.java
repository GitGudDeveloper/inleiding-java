package h11;

import java.applet.Applet;
import java.awt.*;

public class opdracht9 extends Applet {
    public void init() {
        setSize(500, 500);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int breedte = 50;
        int hoogte = 50;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        x = 50;
        y += hoogte;
        for (int vak = 0; vak<8; vak++) {
            if (vak==0||vak==2||vak==4||vak==6) {
                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);
            }
            x+=breedte;
        }
        g.drawRect(50, 50, 400, 400);

    }
}
