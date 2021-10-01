package algorithms.array;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {

        int[]nums = new int[]{3,6,1};
        canMakeArithmeticProgression(nums);
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int i = arr[0];
        int j = arr[1];
        int k = j - i;

        for (int l = 0; l < arr.length; l++) {
            if (l < arr.length-1) {
                if (arr[l+1] - arr[l] != k) {
                    return false;
                }
            }
        }

        return true;
    }
}
