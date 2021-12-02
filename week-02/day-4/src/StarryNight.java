import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void drawStar(int x, int y, Color color, Graphics graphics){
        graphics.setColor(Color.gray);
        graphics.fillRect(x, y, 4, 4);
    }

    public static void drawImage(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        graphics.setColor(Color.black);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        Random randomNumber = new Random();


        for (int i = 0; i < 200; i++) {
            int r = randomNumber.nextInt(35, 120);
            int g = randomNumber.nextInt(35, 120);
            int b = randomNumber.nextInt(35, 120);
            Color starColor = new Color(r, g, b);

            int x = randomNumber.nextInt(595);
            int y = randomNumber.nextInt(595);
            drawStar(x, y, starColor, graphics);
        }


    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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