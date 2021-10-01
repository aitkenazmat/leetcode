package algorithms.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {

//        int[]nums = new int[]{1,1,3,4};
//        int[]nums = new int[]{1,2,2,4};
//        int[]nums = new int[]{1,2,3,4,4};
//        int[]nums = new int[]{2,2};
        int[]nums = new int[]{1,1};
        int[] errorNums = findErrorNums(nums);

        for (int i = 0; i < errorNums.length ; i++) {
            System.out.println(errorNums[i]);
        }
    }

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {

            if (i < nums.length - 1) {
                if (nums[i] == nums[i+1]) {
                    if (i ==0) {
                        if (nums.length == 2) {
                            return new int[]{nums[0], nums[0]-1};
                        } else  {
                            return new int[]{nums[0], nums[0]+1};
                        }
                    }  else {
                        return new int[]{nums[i], nums[i]+1};
                    }

                }
            }
        }

        return nums;
    }
}
