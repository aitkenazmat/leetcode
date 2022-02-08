package algorithms.array;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][]grid = new int[][]{ {0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0},{0,1,0,0} };
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {

        int totalSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length ; j++) {

                if (grid[i][j] == 1) {
                    totalSum+=getPerimeter(grid, i, j);
                }
            }
        }

        return totalSum;
    }

    public static int getPerimeter(int[][]grid, int i , int j) {
        int count = 0;

        try {
            int up = grid[i-1][j];
            if (up==0) {
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            count++;
        }

        try {
            int down = grid[i+1][j];
            if (down == 0) {
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            count++;
        }


        try {
            int right = grid[i][j+1];
            if (right == 0) {
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            count++;
        }

        try {
            int left = grid[i][j-1];
            if (left == 0) {
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            count++;
        }



        return count;
    }
}
