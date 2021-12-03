import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawGreenLine(int x0, int y0, int x1, int y1, Graphics graphics){
        graphics.setColor(Color.green);
        graphics.drawLine(x0, y0, x1, y1);
    }

    public static void drawPurpleLine(int x0, int y0, int x1, int y1, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(x0, y0, x1, y1);
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
        int size = WIDTH/2;
//        ArrayList<Integer> xPoints = new ArrayList<>();
//        ArrayList<Integer> yPoints = new ArrayList<>();
//        for (int i = 0; i <= WIDTH; i += size) {
//            xPoints.add(i);
//        }
//        for (int i = 0; i <= HEIGHT; i+=size) {
//            yPoints.add(i);
//        }


        for (int i = 0; i <= HEIGHT; i+=size) {
            for (int j = 0; j <= WIDTH; j+=size) {
                drawQuarter(j, i, size, graphics);
                for (int x = size/16; x < size; x+=(size/16)) {
                    drawPurpleLine(x, i, j, x, graphics);
                }
                for (int x = size/16; x < size; x+=(size/16)) {
                    drawGreenLine(j, x, x, i, graphics);
                }
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