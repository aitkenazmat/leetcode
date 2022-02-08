package algorithms.array;

public class SpecialPositionsBinaryMatrix {

    public static void main(String[] args) {

        int[][] arr = new int[][]{ {0,0,0,1},{1,0,0,0},{0,1,1,0},{0,0,0,0} };
        System.out.println(numSpecial(arr));
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    if (numSpecial(mat, j, i)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static boolean numSpecial(int[][] mat, int columnIndex, int rowIndex) {
        for (int i = 0; i < mat.length; i++) {
            if (i != rowIndex) {
                if (mat[i][columnIndex] == 1) {
                    return false;
                }
            }
        }

        for (int i = 0; i < mat[rowIndex].length; i++) {
            if (columnIndex != i) {
                if (mat[rowIndex][i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
