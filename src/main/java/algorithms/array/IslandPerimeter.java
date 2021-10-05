package algorithms.array;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][]grid = new int[][]{ {0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0},{5,5,5,5} };
        islandPerimeter(grid);
    }

    public static int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length ; j++) {

                if (grid[i][j] == 1) {
                    getPerimeter(grid, i, j);
                }
            }
        }

        return 0;
    }

    public static int getPerimeter(int[][]grid, int i , int j) {
        int  up = i-1;
        int down = i+1;

        int left = j-1;
        int right = j+1;

        int c = 0;
        if(up >=0 && left >=0) {
            if (grid[up][left]==0) {
                c++;
            }
        } else {
            c++;
        }

        if(up >=0 && right >=0) {
            if (grid[up][right]==0) {
                c++;
            }
        } else {
            c++;
        }


        if(down >=0 && left >=0) {
            if (grid[down][left]==0) {
                c++;
            }
        } else {
            c++;
        }

        if(down >=0 && right >=0) {
            if (grid[down][right]==0) {
                c++;
            }
        } else {
            c++;
        }


        return 0;
    }
}
