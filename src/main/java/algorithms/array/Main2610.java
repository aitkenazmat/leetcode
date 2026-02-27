package algorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main2610 {

  public static void main(String[] args) {

    int[] nums = new int[]{1,1,1,2,2,3};
    findMatrix(nums);
  }

  public static List<List<Integer>> findMatrix(int[] nums) {

    List<List<Integer>> result = new ArrayList<>();

    Map<Integer,Integer> map = new TreeMap<>();
    for(int num : nums) {
      Integer countValue = map.get(num);
      if (countValue != null) {
        map.put(num, countValue + 1);
      } else {
        map.put(num,1);
      }
    }

    List[] arr = new List[getMaxSizeValue(map)];
    for (int i=0; i < getMaxSizeValue(map); i++) {
      List<Integer> list = new ArrayList<>();
      arr[i] = list;
    }

    for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();
      for(int i = 0; i <value; i++) {
        List<Integer> l =  arr[i];
        l.add(key);
      }
    }

    for(List l : arr) {
      result.add(l);
    }
    return result;

  }

  public static int getMaxSizeValue(Map<Integer,Integer> map) {
    int max = 0;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
      if (entry.getValue() >= max) {
        max = entry.getValue();
      }
    }

    return max;
  }
}
