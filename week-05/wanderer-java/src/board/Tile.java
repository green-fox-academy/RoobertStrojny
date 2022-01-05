package board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile {

    BufferedImage image;
    int posX;
    int posY;
    int width;
    int height;

    public Tile(String filename, int posX, int posY) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.posX = posX;
        this.posY = posY;
        width = image.getWidth();
        height = image.getHeight();

    }

    public void draw(int posX, int posY, Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }

    }
//
//    public boolean isEmpty(Tile tile) {
//        if ()
//    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }

}