package board;

import character.Hero;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    Hero hero = new Hero("img/hero-down.png");
    Tile tile = new Tile("img/floor.png", 0, 0);
    Area area = new Area();

    public Board() {

        // set the size of your draw board

        setPreferredSize(new Dimension(tile.getWidth()*10, tile.getHeight()*10));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        area.drawMap(graphics);
        hero.draw(graphics);

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

    public boolean heroCanGoDown() {
        if (hero.getPosY() > 8) {
            return false;
        }
        return true;
    }

    public boolean heroCanGoLeft() {
        if (hero.getPosX() < 1) {
            return false;
        }
        return true;
    }

    public boolean heroCanGoRight() {
        if (hero.getPosX() > 8) {
            return false;
        }
        return true;
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
