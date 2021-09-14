package algorithms.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaximumProductofTwoElementsinanArray {
    public static void main(String[] args) {


        String s = "_Identity_2";

        String substring = s.substring(1);
        System.out.println(substring);
//        int[] nums = new int[]{3,4,5,2};
//
//
//        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1) * (nums[nums.length-2]-1);
    }
}
