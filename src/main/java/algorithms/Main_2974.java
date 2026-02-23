package algorithms;

import java.util.Arrays;

public class Main_2974 {

    public static void main(String[] args) {
        numberGame(new int[]{5,4,2,3,1});
    }


    public static int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        int[]arr = new int[nums.length];
        for (int i = 0; i < nums.length; i+=2) {
            int f = nums[i];
            if (i < nums.length - 1) {
                int s = nums[i + 1];
                arr[i] = s;
                arr[i+1] = f;
            } else {
                arr[nums.length-1] = f;
            }
        }

        return arr;
    }
}
