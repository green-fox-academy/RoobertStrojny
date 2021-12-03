import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Quarters {
    public static void drawGreenLine(int x, Graphics graphics){
        graphics.setColor(Color.green);
        graphics.drawLine(0, x, x, HEIGHT);
    }

    public static void drawPurpleLine(int x, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(x, 0, WIDTH, x);
    }

    public static void drawQuarter(int x0, int y0, int size, Graphics graphics){
        graphics.drawRect(x0, y0, size, size);
    }

    public static void drawImage(Graphics graphics) {

//        for (int x = 20; x < WIDTH; x+=20) {
//            drawPurpleLine(x, graphics);
//        }
//
//        for (int x = 20; x < HEIGHT; x+=20) {
//            drawGreenLine(x, graphics);
//        }
        int xDivide = 0;
        int yDivide = 0;
        int size = WIDTH/2;

        for (int i = 0; i < HEIGHT; i+=size) {
            for (int j = 0; j < WIDTH; j+=size) {
                drawQuarter(j, i, size, graphics);
            }
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