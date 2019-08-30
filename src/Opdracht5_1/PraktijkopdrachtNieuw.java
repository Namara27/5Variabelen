package Opdracht5_1;

import java.awt.*;
import java.applet.*;

public class PraktijkopdrachtNieuw extends Applet{
    private Color paars;
    private Color zwart;
    private int breedte;
    private int hoogte;

        public void init() {
            paars = Color.magenta;
            zwart = Color.black;
            breedte = 190;
            hoogte = 80;
        }

        public void paint(Graphics g) {
            //Lijn
            g.drawString("Lijn",90,40);
            g.drawLine(10,20, 200,20);
            //Rechthoek
            g.drawString("Rechthoek", 80,150);
            g.drawRect(10,50, breedte, hoogte);
            //Afgeronde Rechthoek
            g.drawString("Afgeronde Rechthoek",50,260);
            g.drawRoundRect(10,160, breedte, hoogte, 30,30);
            //Gevulde rechthoek met ovaal
            g.drawString("Gevulde rechthoek met ovaal", 230,150);
            g.setColor(paars);
            g.fillRect(210,50,breedte, hoogte);
            g.setColor(zwart);
            g.drawOval(210,50,breedte, hoogte);
            //Gevulde ovaal
            g.drawString("Gevulde ovaal",260,260);
            g.setColor(paars);
            g.fillOval(210,160,190, hoogte);
            //Taartpunt met ovaal eromheen
            g.setColor(paars);
            g.fillArc(410,50,breedte, hoogte,0,45);
            g.setColor(zwart);
            g.drawString("Taartpunt met ovaal eromheen",420,150);
            g.drawOval(410,50,breedte, hoogte);
            //Cirkel
            g.drawString("Cirkel",495,260);
            g.drawArc(470,160,80, hoogte,0,360);



        }
}
