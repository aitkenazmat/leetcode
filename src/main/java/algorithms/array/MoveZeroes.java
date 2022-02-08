package algorithms.array;

import java.util.Stack;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] == 0 ) {
                zeroCount++;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = zeroCount+1; i < nums.length; i++) {
            nums[i] = 0;
        }

        System.out.println(nums.length);
    }
}
