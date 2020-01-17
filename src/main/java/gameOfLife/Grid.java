package gameOfLife;

import java.util.Arrays;
//import java.util.List;

public class Grid {
    private int height;
    private int width;
    private Cell[][] grid;

    public Grid(int height, int width) {
        grid = new Cell[height][width];
        this.height = height;
        this.width = width;
    }

    public void initialize() {
        Cell cell = new Cell(Etats.Dead);
        for (int i = 0; i < height; i++) {
            Arrays.fill(grid[i], cell);
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                res += grid[i][j].toString();
            }
            res += "\n";
        }
        return res;
    }
}
