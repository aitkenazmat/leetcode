package algorithms.string;

import java.util.LinkedList;
import java.util.List;

public class SubsetsM {

    public static void main(String[] args) {

        int[]nums = new int[]{1,2,2};

        subsetsWithDup(nums);
    }


    public static java.util.List<List<Integer>> subsetsWithDup(int[] nums) {
        int level = nums.length;
        for (int i = 1; i <= level; i++) {
            //System.out.println(i);
            for (int j = 0; j < nums.length; j++) {
                List<Integer> integers = doSomething(level, nums);
                System.out.println(integers);
                System.out.println("-----------------------------------");
            }
        }


        return null;
    }


    public  static List<Integer> doSomething(int level, int[]nums){
        List<Integer> subsets = new LinkedList<>();
        for (int i = 0; i < nums.length ; i++) {
            subsets.add(nums[i]);
            if (subsets.size() >= level) {
                break;
            }
        }
        return subsets;
    }
}
