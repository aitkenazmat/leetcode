package algorithms;

import java.util.Arrays;

public class Main_2099 {
  public static void main(String[] args) {
    int[]nums = new int[]{0,10};
    smallestRangeI(nums, 2);
  }

  public static int smallestRangeI(int[] nums, int k) {

    for (int x = -k; x <= k; x++) {

    }
    return 0;
  }



  public static int minMaxGame(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    int[]newNums = new int[nums.length /2];

    int c = 1;
    int idx  = 0;
    for (int i = 0; i < nums.length-1; i+=2) {

      if (c % 2 != 0) {
        newNums[idx] = Math.min(nums[i],nums[i+1]);

      } else {
        newNums[idx] = Math.max(nums[i],nums[i+1]);
      }
      c++;
      idx++;


    }
    return minMaxGame(newNums);
  }

}
