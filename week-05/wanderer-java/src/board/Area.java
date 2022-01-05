package board;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Area {
    int[][] map = new int[][]{{0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 1}};

    List<Tile> tileList = new ArrayList<>();

    public void drawMap(Graphics graphics) {
        int posY = 0;
        int index = 0;

        for (int i = 0; i < 10; i++) {
            int posX = 0;
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 0){
                    tileList.add(new Floor(j, i));
                    tileList.get(index).draw(posX, posY, graphics);
                } else {
                    tileList.add(new Wall(j, i));
                    tileList.get(index).draw(posX, posY, graphics);
                }
                posX += tileList.get(0).getWidth();
                index++;
            }
            posY += tileList.get(0).getHeight();
        }
    }

    public int[][] getMap() {
        return map;
    }
}
