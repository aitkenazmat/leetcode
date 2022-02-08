package algorithms.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,5,2,3};
        int target = 2;
        targetIndices(nums, target);
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> response  = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target) {
                response.add(i);
            }
        }
        return response;
    }
}
