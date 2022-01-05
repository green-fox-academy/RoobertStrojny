package board;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntFunction;

public class Area {
    int[][] map;

    List<Tile> tileList = new ArrayList<>();

    public Area() {
        this.map = readMapTo2dArray();
    }

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

    public int[][] readMapTo2dArray()  {
        Scanner sc = scanFile();
        int rows = 10;
        int columns = 10;
        int [][] myArray = new int[rows][columns];
        while(sc.hasNextLine()) {
            for (int i=0; i<myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j=0; j<line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }

        return myArray;
    }

    public Scanner scanFile() {
        try {
            Scanner sc = new Scanner(new BufferedReader(new FileReader("src/map.txt")));
            return sc;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int[][] getMap() {
        return map;
    }
}
