import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void randomRectangles(Graphics graphics){
        Random randomNumber = new Random();


        for (int i = 0; i < 4; i++) {
            int r = randomNumber.nextInt(256);
            int g = randomNumber.nextInt(256);
            int b = randomNumber.nextInt(256);

            int x = randomNumber.nextInt(160);
            int y = randomNumber.nextInt(160);
            graphics.setColor(new Color(r, b, g));
            graphics.drawRect(x, y, x, y);
        }

    }

    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!
        randomRectangles(graphics);

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