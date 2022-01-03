package character;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Hero extends Character {

    BufferedImage image;
    int posX;
    int posY;
    int heroWidth;
    int heroHeight;


    public Hero(String filename) {
        readImage(filename);
        heroWidth = image.getWidth();
        heroHeight = image.getHeight();
        posY = 0;
        posX = 0;

    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
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
            posY -= getHeroHeight();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            readImage("img/hero-down.png");
            posY += getHeroHeight();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            readImage("img/hero-left.png");
            posX -= getHeroWidth();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            readImage("img/hero-right.png");
            posX += getHeroWidth();
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