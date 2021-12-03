import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void drawGreenLine(int x0, int y0, int x1, int y1, Graphics graphics){
        graphics.setColor(Color.green);
        graphics.drawLine(x0, y0, x1, y1);
    }


    public static void drawImage(Graphics graphics) {
        int i = 150;

        for (int fix = 10; fix < HEIGHT/2; fix+=10) {
            drawGreenLine(HEIGHT/2, fix, i, HEIGHT/2, graphics);
            i-=10;
        }

        i = 160;

        for (int fix = 10; fix < HEIGHT/2; fix+=10) {
            drawGreenLine(HEIGHT/2, fix, i, HEIGHT/2, graphics);
            i+=10;
        }

        i=160;

        for (int fix = 10; fix < HEIGHT/2; fix+=10) {
            drawGreenLine(fix, HEIGHT/2, HEIGHT/2, i, graphics);
            i+=10;
        }

        i=HEIGHT-10;

        for (int fix = 160; fix < HEIGHT; fix+=10) {
            drawGreenLine(fix, HEIGHT/2, HEIGHT/2, i, graphics);
            i-=10;
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