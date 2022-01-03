package board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Tile {

    BufferedImage image;
    int width;
    int height;



    public Tile(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        width = image.getWidth();
        height = image.getHeight();

    }

    public void draw(int posX, int posY, Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, posX, posY, null);
        }

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}