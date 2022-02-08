package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class SmallestIndexWithEqualValue {

    public static void main(String[] args) {

//        int[] nums = new int[]{0,1,2};
//        int[] nums = new int[]{4,3,2,1};
//        int[] nums = new int[]{4,3,2,3};
//        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,0};
        int[] nums = new int[]{7,8,3,5,2,6,3,1,1,4,5,4,8,7,2,0,9,9,0,5,7,1,6};
        System.out.println(smallestEqual(nums));
    }

    public static int smallestEqual(int[] nums) {
        List<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i % 10) {
                indexes.add(i);
            }
        }

        if (indexes.size() ==0) {
            return -1;
        } else if (indexes.size() == nums.length) {
            return 0;
        } else {
            return indexes.get(0);
        }

    }
}
