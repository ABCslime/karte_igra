package programs;

import javax.swing.*;
import java.awt.*;

public class mainevent {


    public static class DrawPane extends JPanel {
        public void paintComponent(Graphics g) {
            Graphics g2d = (Graphics2D) g.create();
            g.setColor(Color.black);
            g.drawLine(100,200,100,500);


        }
    }
}
