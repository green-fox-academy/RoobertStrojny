import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void drawGreenLine(int x, Graphics graphics){
        graphics.setColor(Color.green);
        graphics.drawLine(0, x, x, HEIGHT);
    }

    public static void drawPurpleLine(int x, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(x, 0, WIDTH, x);
    }

    public static void drawImage(Graphics graphics) {

        for (int x = 20; x < WIDTH; x+=20) {
            drawPurpleLine(x, graphics);
        }

        for (int x = 20; x < HEIGHT; x+=20) {
            drawGreenLine(x, graphics);
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}