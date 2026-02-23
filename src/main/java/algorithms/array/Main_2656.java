package algorithms.array;

import java.util.Arrays;

public class Main_2656 {

    public static void main(String[] args) {


        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(maximizeSum(nums, 3));
    }

    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        maximizeSum(nums);


        return 0;



    }

    public static void maximizeSum(int[] nums) {
        int m = nums[nums.length-1];
        int r = m + 1;
        nums[nums.length-1] = r;
    }
}
