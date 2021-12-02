import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void whiteSquare(int x, int y, Graphics graphics){
        graphics.setColor(Color.white);
        graphics.fillRect(x, y, 20, 20);
    }

    public static void blackSquare(int x, int y, Graphics graphics){
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, 20, 20);
    }

    public static void drawImage(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern
        int position = 0;
        for (int i = 0; i < HEIGHT; i+=20) {
            for (int j = 0; j < WIDTH; j+=20) {
                if (position % 2 == 0){
                    blackSquare(j, i, graphics);
                }else if (position % 2 == 1){
                    whiteSquare(j, i, graphics);
                }
                position++;
            }
            position++;
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