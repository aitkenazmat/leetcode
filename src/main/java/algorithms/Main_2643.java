package algorithms;

public class Main_2643 {
    public static void main(String[] args) {

        int[][] mat = new int[][]{ {1,2,3},{4,5,6} , {7,8,9} };
        rowAndMaximumOnes(mat);
    }

    public static int[] rowAndMaximumOnes(int[][] mat) {

        int[] res = new int[]{0, 0};


        int iMax = 0;
        int iCountMax = Integer.MIN_VALUE;

        for (int i = 0; i < mat.length; i++) {

            int[] arr = mat[i];

            int count = count(arr);

            if (count > iCountMax) {
                iCountMax = count;
                iMax = i;
            }




        }

        return iCountMax != Integer.MIN_VALUE ? new int[]{iMax, iCountMax} :  res;

    }


    public static int count(int [] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count ++;
            }
        }
        return count;
    }
}
