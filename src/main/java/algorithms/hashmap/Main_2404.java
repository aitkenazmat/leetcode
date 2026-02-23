package algorithms.hashmap;

import java.util.*;

public class Main_2404 {
  public static void main(String[] args) {

    int [] nums1 = new int[]{0,1,2,2,4,4,1};
    int [] nums2 = new int[]{4,4,4,9,2,4};
    int [] nums3 = new int[]{29,47,21,41,13,37,25,7};
    System.out.println(mostFrequentEven(nums1));
    System.out.println(mostFrequentEven(nums2));
    System.out.println(mostFrequentEven(nums3));
  }

  public static int mostFrequentEven(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int elementArr = nums[i];
      Integer val = map.get(elementArr);
      if (val==null) {
        if (elementArr % 2 == 0) {
          map.put(elementArr, 1);
        }
      } else {
        Integer c = val + 1;
        map.put(elementArr, c);
      }
    }

    return getCandidate(map);
  }

  static int getCandidate(Map<Integer,Integer> map) {

    Integer max = Integer.MIN_VALUE;
    List<Integer> ints = new ArrayList<>();
    for (Map.Entry<Integer,Integer> entry :  map.entrySet()) {
      if (entry.getValue()> max) {
        max = entry.getValue();
      }
    }



    for (Map.Entry<Integer,Integer> entry :  map.entrySet()) {
      if (Objects.equals(entry.getValue(), max)) {
        ints.add(entry.getKey());
      }
    }

    Collections.sort(ints);




    return !ints.isEmpty() ? ints.get(0): -1;
  }
}
