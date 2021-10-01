package algorithms.array;

import java.util.*;

public class MaximumProductofThreeNumbers {
    public static void main(String[] args) {
//        int[]nums = new int[]{-100,-98,-1,2,3,4};
//        int[]nums = new int[]{-1,-2,-3};
        int[]nums = new int[]{-1000,-1000,1000};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Map<Integer, Integer> negativeIntegers  = new HashMap<>();
        Map<Integer, Integer> positiveIntegers  = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <0) {
                negativeIntegers.put(Math.abs(nums[i]), nums[i]);
                nums[i] = Math.abs(nums[i]);
            } else  {
                positiveIntegers.put(nums[i],nums[i]);
            }
        }
        Arrays.sort(nums);
        int a = negativeIntegers.get(nums[nums.length-1])!=null?  nums[nums.length-1] * -1 : nums[nums.length-1]  ;
        int b = negativeIntegers.get(nums[nums.length-2])!=null?  nums[nums.length-2] * -1 : nums[nums.length-2]  ;
        int c = negativeIntegers.get(nums[nums.length-3])!=null?  nums[nums.length-3] * -1 : nums[nums.length-3]  ;
        return a*b*c;
    }
}
