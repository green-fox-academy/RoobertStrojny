package character;


import board.Area;
import board.Board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    BufferedImage image;
    int imagePositionX;
    int imagePositionY;
    int heroWidth;
    int heroHeight;
    int posX;
    int posY;
    int[] positionOnMap;


    public Hero(String filename) {
        readImage(filename);
        heroWidth = image.getWidth();
        heroHeight = image.getHeight();
        imagePositionY = 0;
        imagePositionX = 0;
        posX = 0;
        posY = 0;
        positionOnMap = new int[]{posX, posY};

    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, imagePositionX, imagePositionY, null);
        }

    }

    public int getHeroWidth() {
        return heroWidth;
    }

    public int getHeroHeight() {
        return heroHeight;
    }


    public void move(KeyEvent e) {
        Board board = new Board();
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            readImage("img/hero-up.png");
            if (heroCanGoUp()) {
                imagePositionY -= getHeroHeight();
                posY -= 1;
                System.out.println(posY);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            readImage("img/hero-down.png");
            if (heroCanGoDown()) {
                imagePositionY += getHeroHeight();
                posY += 1;
                System.out.println(posY);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            readImage("img/hero-left.png");
            if (heroCanGoLeft()) {
                imagePositionX -= getHeroWidth();
                posX -= 1;
                System.out.println(posX);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            readImage("img/hero-right.png");
            if (heroCanGoRight()) {
                imagePositionX += getHeroWidth();
                posX += 1;
                System.out.println(posX);
            }
        }
        draw(image.getGraphics());
    }

    public boolean heroCanGoUp() {
        return posY != 0;
    }

    public boolean heroCanGoDown() {
        return posY != 9;
    }

    public boolean heroCanGoLeft() {
        return posX != 0;
    }

    public boolean heroCanGoRight() {
        return posX != 9;
    }

    private void readImage(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int[] getPositionOnMap() {
        return positionOnMap;
    }
}