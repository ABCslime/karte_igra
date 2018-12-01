import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers


public class screen extends JFrame {
    public static int x = 640;
    public static int y =480;

    public static final int WIDTH  = x;
    public static final int HEIGHT = y;


    private DrawCanvas canvas;


    public screen() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(WIDTH, HEIGHT));


        Container cp = getContentPane();
        cp.add(canvas);


        setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
        pack();              // Either pack() the components; or setSize()
        setTitle("0.1");  // "super" JFrame sets the title
        setVisible(true);    // "super" JFrame show
    }

    /**
     * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
     */
    private class DrawCanvas extends JPanel {
        // Override paintComponent to perform your own painting
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);     // paint parent's background
            setBackground(Color.WHITE);  // set background color for this JPanel

            // Your custom painting codes. For example,
            // Drawing primitive shapes
            g.setColor(Color.black);    // set the drawing color
            g.drawLine(0, 400, x, 400);
            g.drawLine(100, 400, x, 400);


        }
    }

    // The entry main method
    public static void main(String[] args) {
        // Run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new screen(); // Let the constructor do the job
            }
        });
    }
}
