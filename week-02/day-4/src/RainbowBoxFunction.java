import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void drawSquare(int size, String color, Graphics graphics){
        graphics.setColor(Color.decode(color));
        int xStart = (WIDTH/2) - (size/2);
        int yStart = (HEIGHT/2) - (size/2);
        graphics.drawRect(xStart, yStart, size, size);
    }

    public static void drawImage(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters
        // (the square size, the fill color and the graphics)
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        String[] colors = {"#ff0000", "#e69138", "#f8fd00", "#adf707", "#0c86f5", "#4b0082", "#5b2be7"};
        int[] size = {20, 40, 60, 80, 100, 120, 140};
        for (int i = 0; i < 7; i++) {
            drawSquare(size[i], colors[i], graphics);
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