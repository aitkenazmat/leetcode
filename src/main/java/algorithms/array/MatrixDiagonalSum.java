package algorithms.array;

import java.util.Set;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        int[][] mat =  { {1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1} };
        System.out.println(diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat) {
        int[] mat1 = mat[0];
        int sum = 0;
        for (int i = 0; i < mat1.length ; i++) {
            int d1 = mat[i][i] + mat[i][(mat1.length-1)-i];
            sum+=d1;
        }
        if (mat1.length % 2 == 0) {
            return sum;
        } else {
            int centerIndex = mat1.length/2;
            return sum - mat[centerIndex][centerIndex];
        }
    }
}
