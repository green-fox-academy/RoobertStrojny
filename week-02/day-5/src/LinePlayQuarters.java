import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void drawGreenLine(int x0, int y0, int x1, int y1, Graphics graphics){
        graphics.setColor(Color.green);
        graphics.drawLine(x0 , y0, x1, y1);
    }

    public static void drawPurpleLine(int fix, int y0, int x1, Graphics graphics){
        graphics.setColor(Color.MAGENTA);
        graphics.drawLine(fix, y0, x1, fix);
    }


    public static void drawImage(Graphics graphics) {
        List<Integer> edgePoints = new ArrayList<>();
        int divider = 4;
        int distanceBetweenLines = 10;
        int size = WIDTH/divider;
        for (int i = 0; i <= WIDTH; i+=size) {
            edgePoints.add(i);
        }



        for (int y = 0; y < divider; y++) {
            int position = size;

            for (int x = 0; x < divider; x++) {
                for (int green = edgePoints.get(x) + distanceBetweenLines; green < (edgePoints.get(x) + size); green += distanceBetweenLines) {
                    drawGreenLine(edgePoints.get(x), green, green, position, graphics);
                }
                for (int purple = edgePoints.get(x) + distanceBetweenLines; purple < edgePoints.get(x) + size; purple += distanceBetweenLines) {
                    drawPurpleLine(purple, edgePoints.get(x), position, graphics);
                }
                position += size;
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