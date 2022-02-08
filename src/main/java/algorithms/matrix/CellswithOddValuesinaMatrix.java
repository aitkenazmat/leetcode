package algorithms.matrix;

public class CellswithOddValuesinaMatrix {
    public static void main(String[] args) {

        int[][] indices = new int[][]{ {0,1},{1,1} };
        int m = 5;
        int n = 2;

//        int[][] indices = new int[][]{ {1,1},{0,0} };
//        int m = 2;
//        int n = 2;

        System.out.println(oddCells(m, n, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] r = new int[m][n];


        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int j = 0; j < n; j++) {
                r[row][j] = r[row][j]+ 1;
            }

            for (int j = 0; j < m; j++) {
                r[j][col] = r[j][col]+1;
            }
        }


        int odd = 0;
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length ; j++) {
                if (r[i][j] % 2 !=0) {
                    odd++;
                }
            }
        }

        return odd;
    }
}
