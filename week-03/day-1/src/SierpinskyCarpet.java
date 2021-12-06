import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {

    public static void divider(int x, int y, int position){

    }



    public static void recursiveSquare(int x, int y, int size, Graphics graphics){
        graphics.fillRect(x/3, y/3, size/3, size/3);

        int width = x/3;
        int height = y/3;
        int sizeRecursive = size/3;

        if (size < 1) {

            for (int i = 0; i < height; i += height / 3) {
                for (int j = 0; j < width; j += width / 3) {
                    recursiveSquare(j, i, size / 3, graphics);
                }
            }

        }

    }


    public static void drawImage(Graphics graphics) {
        recursiveSquare(WIDTH, HEIGHT, WIDTH, graphics);

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