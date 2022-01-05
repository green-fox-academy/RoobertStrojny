package character;

import board.Area;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Skeleton extends Character{
    BufferedImage image;
    int imagePositionX;
    int imagePositionY;
    int skeletonWidth;
    int skeletonHeight;
    int posX;
    int posY;
    int[] positionOnMap;
    int[][] map = new Area().readMapTo2dArray();

    public Skeleton() {
        readImage("img/skeleton.png");
        skeletonWidth = image.getWidth();
        skeletonHeight = image.getHeight();
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

    public void spawn() {

    }

    private void readImage(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getSkeletonWidth() {
        return skeletonWidth;
    }

    public int getSkeletonHeight() {
        return skeletonHeight;
    }

}
