package algorithms.backtracking;

import java.util.*;

public class Main_18 {
  public static void main(String[] args) {

    int[]nums = new int[]{1,0,-1,0,-2,2};

    fourSum(nums, 0);
  }


  public static List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    Map<Integer,Set<Integer>> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.computeIfAbsent(nums[i], s-> new HashSet<>()).add(i);
    }

    Set<List<Integer>> set = new HashSet<>();

    for (int a = 0; a < nums.length; a++) {
      for (int b = a + 1; b < nums.length; b++) {
        for (int c = b +1; c < nums.length; c++) {
          int sum = nums[a]+nums[b]+nums[c];
          int key = target - sum;
          if (map.containsKey(key)) {
            Set<Integer> set1 = map.get(key);
            if (!set1.contains(a) && !set1.contains(b) && !set1.contains(c)) {

              List<Integer> list = new ArrayList<>();
              list.add(nums[a]);
              list.add(nums[b]);
              list.add(nums[c]);
              list.add(key);

              set.add(list);
            }
          }
        }
      }
    }

    return set.stream().toList();
  }
}
