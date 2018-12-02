package programs;

import java.awt.*;       // Using AWT's Graphics and Color
import javax.swing.*;    // Using Swing's components and containers


public class screen extends JFrame {
    public static int x = 100;
    public static int y = 1;

    static JFrame frame = new JFrame();
    public static Graphics2D g2d;


    public screen() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        final int WIDTH = dim.width;
        final int HEIGHT = dim.height;


        //Create a JFrame


        frame.setSize(new Dimension(WIDTH, HEIGHT));


        //set properties for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setUndecorated(false);

        frame.setVisible(true);
        frame.setContentPane(new mainevent.DrawPane());

    }


    // The entry main method
    public static void main(String[] args) {
        new screen();



    }


}


