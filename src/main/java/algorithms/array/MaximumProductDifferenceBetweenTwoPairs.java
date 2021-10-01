package algorithms.array;

import java.util.Arrays;
import java.util.Map;

public class MaximumProductDifferenceBetweenTwoPairs {

    public static void main(String[] args) {
        int[]nums = new int[]{5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[1];
        int c = nums[nums.length-1];
        int d = nums[nums.length-2];

        return (c*d) - (a*b)  ;
    }
}
