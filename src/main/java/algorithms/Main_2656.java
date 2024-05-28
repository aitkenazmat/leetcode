package algorithms;

import java.util.Arrays;

public class Main_2656 {

    public static void main(String[] args) {

        maximizeSum(new int[]{1,2,3,4,5}, 3);
    }

    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = nums[nums.length-1];
        for (int i = 1; i < k; i++) {
            nums[nums.length-1] = nums[nums.length-1] + 1 ;
            sum+=nums[nums.length-1];
        }
        return sum;
    }
}
