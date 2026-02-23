package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Main_26 {
  public static void main(String[] args) {

    int[]nums = new int[]{0,0,1,1,1,2,2,3,3,4};
    System.out.println(removeDuplicates(nums));
  }

  public static int removeDuplicates(int[] nums) {

    int[]arr = nums;
    int count  = 0;
    Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      Integer val = map.get(num);
      if(val != null) {
        arr[i] = -100;
      } else {
        count++;
        map.put(num, num);
      }
    }

    return count;
  }
}
