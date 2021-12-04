import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void drawTriangle(Graphics graphics){
        graphics.drawLine(0,HEIGHT-40, WIDTH, HEIGHT-40);
        graphics.drawLine(WIDTH, HEIGHT-40, WIDTH/2, HEIGHT/3);
        graphics.drawLine(WIDTH/2, HEIGHT/3, 0, HEIGHT-40);
    }

    public static void drawImage(Graphics graphics) {
        drawTriangle(graphics);




    }

    // Don't touch the code below
    static int WIDTH = 400;
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