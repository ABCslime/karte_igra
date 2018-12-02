package programs;

import javax.swing.*;
import java.awt.*;

public class mainevent {

    public static int res;
    public static int cardx1;
    public static int cardy1;
    public static class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            Graphics g2d = (Graphics2D) g.create();
            g.setColor(Color.lightGray);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            final int WIDTH = dim.width;
            final int HEIGHT = dim.height;
            cardx1 = WIDTH;
            cardy1 = HEIGHT;
            res = HEIGHT/11;


            g.drawLine(WIDTH/2-res*3,res*2,WIDTH/2+res*3,res*2);
            g.drawLine(WIDTH/2-res*3,res*3,WIDTH/2+res*3,res*3);
            g.drawLine(WIDTH/2-res*3,res*4,WIDTH/2+res*3,res*4);
            g.drawLine(WIDTH/2-res*3,res*5,WIDTH/2+res*3,res*5);
            g.drawLine(WIDTH/2-res*3,res*6,WIDTH/2+res*3,res*6);
            g.drawLine(WIDTH/2-res*3,res*7,WIDTH/2+res*3,res*7);
            g.drawLine(WIDTH/2-res*3,res*8,WIDTH/2+res*3,res*8);
            g.drawLine(WIDTH/2-res*3,res*9,WIDTH/2+res*3,res*9);


            g.drawLine(WIDTH/2-res*3,res*2,WIDTH/2-res*3,res*9);
            g.drawLine(WIDTH/2-res*2,res*2,WIDTH/2-res*2,res*9);
            g.drawLine(WIDTH/2-res*1,res*2,WIDTH/2-res*1,res*9);
            g.drawLine(WIDTH/2,res*3,WIDTH/2,res*8);
            g.drawLine(WIDTH/2+res*1,res*2,WIDTH/2+res*1,res*9);
            g.drawLine(WIDTH/2+res*2,res*2,WIDTH/2+res*2,res*9);
            g.drawLine(WIDTH/2+res*3,res*2,WIDTH/2+res*3,res*9);

            new inHand();

            g.clearRect(cardx1,cardy1,res*6/8,res*2);







        }
    }
}
