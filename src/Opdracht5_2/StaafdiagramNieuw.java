package Opdracht5_2;

import java.awt.*;
import java.applet.*;

public class StaafdiagramNieuw extends Applet {
        int gewichtV;
        int lengteV;
        int gewichtJ;
        int lengteJ;
        int gewichtH;
        int lengteH;

        public void init() {
                //lengte is voor de staaf, zelfde aantal veranderen als het gewicht
                //y-as ligt op 200 en x-as is met stapjes van 30 (dan-5 om de staaf in t midden te krijgen)
                gewichtV = 145;
                lengteV = 55;
                gewichtJ = 55;
                lengteJ = 145;
                gewichtH = 85;
                lengteH = 115;
        }

        public void paint(Graphics g) {
                g.drawLine(50,20,50,200);
                g.drawLine(50,200,250,200);
                g.drawString("Valerie", 70, 220);
                g.drawString("Jeroen", 130, 220);
                g.drawString("Hans", 190, 220);
                g.drawString("20", 30, 180);
                g.drawString("40", 30, 150);
                g.drawString("60", 30, 120);
                g.drawString("80", 30, 90);
                g.drawString("100", 25, 60);
                g.drawString("120", 25, 30);
                g.drawString("(kg)", 25, 10);
                g.setColor(Color.red);
                g.fillRect(70, gewichtV, 40,lengteV);
                g.setColor(Color.blue);
                g.fillRect(130, gewichtJ, 40, lengteJ);
                g.setColor(Color.green);
                g.fillRect(190, gewichtH, 40, lengteH);
        }
}
