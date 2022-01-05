package character;


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
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            readImage("img/hero-up.png");
            imagePositionY -= getHeroHeight();
            posY -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            readImage("img/hero-down.png");
            imagePositionY += getHeroHeight();
            posY += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            readImage("img/hero-left.png");
            imagePositionX -= getHeroWidth();
            posX -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            readImage("img/hero-right.png");
            imagePositionX += getHeroWidth();
            posX += 1;
        }
        draw(image.getGraphics());
    }

    private void readImage(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}