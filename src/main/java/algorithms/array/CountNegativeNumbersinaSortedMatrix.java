package algorithms.array;

public class CountNegativeNumbersinaSortedMatrix {
    public static void main(String[] args) {

        int[][]grid = new int[][]{ {1,-1}, {-1,-1} };
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int negativeCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length ; j++) {
                if (grid[i][j] < 0) {
                    negativeCount++;
                }
            }
        }

        return negativeCount;
    }
}
