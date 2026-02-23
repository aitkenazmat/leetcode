package algorithms.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main_219 {
  public static void main(String[] args) {

  }

  public static boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int key = nums[i];
      if (map.containsKey(key) && i - map.get(key)  <= k) {
        return true;
      }
      map.put(key, i);
    }


    return false;
  }
}
