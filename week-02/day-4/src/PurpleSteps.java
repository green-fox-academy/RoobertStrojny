import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void drawSteps(int x, int y, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(x, y, 20, 20);
        graphics.setColor(Color.black);
        graphics.drawRect(x, y, 20, 20);
    }

    public static void drawImage(Graphics graphics) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 19; i++) {
            drawSteps(x+=20, y+=20, graphics);
        }

    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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