package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class LuckyNumbersinaMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{ {3,7,8}, {9,11,13} , {15,16,17}, {1,1,1} };
//        int[][] matrix = new int[][]{ {3,6}, {7,1} , {5,2}, {4,8} };
//        int[][] matrix = new int[][]{ {7,8}, {1,2} };
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < matrix.length; i++) {
            int[] partOfMatrixByGorizontal =  matrix[i];
            int minIndex =  getIndexMinNum(partOfMatrixByGorizontal);
            int minGorizontal = partOfMatrixByGorizontal[minIndex];

            int[]partOfMatrixByVertical = new int[matrix.length];
            for (int j = 0; j < matrix.length ; j++) {
                partOfMatrixByVertical[j] = matrix[j][minIndex];
            }

            int indexMaxNum = getIndexMaxNum(partOfMatrixByVertical, minGorizontal, minIndex);
            if (indexMaxNum == partOfMatrixByGorizontal[minIndex]) {
                integers.add(indexMaxNum);
            }

        }

        return integers;
    }


    public static int getIndexMinNum(int[]nums) {
        int min = nums[0];
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int getIndexMaxNum(int[]nums, int max, int maxIndex) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        return max;
    }
}
