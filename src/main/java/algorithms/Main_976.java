package algorithms;

import java.util.Arrays;

public class Main_976 {
  public static void main(String[] args) {
//    int[]nums = new int[]{1,2,3,4,5,6,7,8,9};
    int[]nums = new int[]{3,2,3,4};
    System.out.println(largestPerimeter(nums));
  }

  public static int largestPerimeter(int[] nums) {

    Arrays.sort(nums);

    for(int i =nums.length - 1; i > 1; i--) {
      if(nums[i] < nums[i-1] + nums[i-2]) {
        return nums[i] + nums[i-1] + nums[i-2];
      }
    }

    return 0;

  }
}
