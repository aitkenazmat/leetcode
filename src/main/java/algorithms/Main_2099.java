package algorithms;

import java.util.Arrays;

public class Main_2099 {
    public static void main(String[] args) {
        int[]nums = new int[]{-1,-2,3,4,5};
        maxSubsequence(nums, 3);
    }

    public static int[] maxSubsequence(int[] nums, int k) {

        Arrays.sort(nums);

        int[]newArr = new int[k];
        int idx=0;
        for (int i = nums.length-1; i >= nums.length-k; i--) {
            System.out.println();
            newArr[idx] = nums[i];
            idx++;
        }

        Arrays.sort(newArr);

       return newArr;

    }
}
