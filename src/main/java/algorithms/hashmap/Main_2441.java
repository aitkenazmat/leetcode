package algorithms.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main_2441 {

  public static void main(String[] args) {

    int[]nums = new int[]{2,21,5,43,21,16,-13,-37,29,41,14,34,19,7,30};
    findMaxK(nums);
  }

  public static int findMaxK(int[] nums) {
    Arrays.sort(nums);
    Map<Integer,Integer> map = new HashMap<>();
    int max = -1;
    for (int i = nums.length-1 ; i >= 0 ; i--) {
      Integer val = map.get(Math.abs(nums[i]));
      if (val != null && val * 2 == val - nums[i]) {
        max = Math.abs(nums[i]);
      } else {
        map.put(nums[i],nums[i]);
      }
    }
    return max;
  }
}
