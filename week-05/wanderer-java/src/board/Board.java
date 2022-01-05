package board;

import character.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int[][] map;
    Tile floor = new Tile("img/floor.png");
    Tile wall = new Tile("img/wall.png");
    Hero hero = new Hero("img/hero-down.png");
    Floor floor1 = new Floor();

    public Board() {
        map = new int[][]{{0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 1}};

        // set the size of your draw board

        setPreferredSize(new Dimension(floor.getWidth()*10, floor.getHeight()*10));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        floor1.draw(0, 0, graphics);

//        drawMap(graphics);
//        hero.draw(graphics);

    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("Wanderer");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    private void drawMap(Graphics graphics){
        int posY = 0;

        for (int i = 0; i < 10; i++) {
            int posX = 0;
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 0){
                    floor.draw(posX, posY, graphics);
                } else {
                    wall.draw(posX, posY, graphics);
                }
                posX += floor.getWidth();
            }
            posY += floor.getHeight();
        }
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        hero.move(e);
        // and redraw to have a new picture with the new coordinates
        repaint();

    }

}
