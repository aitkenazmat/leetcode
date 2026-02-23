package algorithms.hashmap;

import java.util.*;


public class Main_1436 {
  public static void main(String[] args) {
    int[]arr = new int[]{1,13,10,12,31};
    countDistinctIntegers(arr);
  }

  public static String destCity(List<List<String>> paths) {
    Map<String,String> map = new HashMap<>();
    for (List<String> path :  paths) {
      String a =  path.get(0);
      String b =  path.get(1);

      map.put(a, b);
    }


    return "";
  }

  public static int countDistinctIntegers(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
      set.add(reverse(nums[i]));
    }

    return set.size();
  }

  public static int  reverse(int number) {
    int  reverse = 0;
    while(number != 0) {
      int remainder = number % 10;
      reverse = reverse * 10 + remainder;
      number = number/10;
    }
    return reverse;
  }
}
