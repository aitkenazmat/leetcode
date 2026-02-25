package algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class Main2657 {

  public static void main(String[] args) {
    findThePrefixCommonArray(new int[]{1,3,2,4}, new int[]{3,1,2,4});
  }

  public static int[] findThePrefixCommonArray(int[] A, int[] B) {

    int startIdx = 0;
    int idx = 0;
    int[] result = new int[A.length];

    for(int i= 0; i < A.length; i++) {
      Map<Integer,Integer> mapOfA = getMapOfBetweenArr(startIdx, i, A);
      Map<Integer,Integer> mapOfB = getMapOfBetweenArr(startIdx, i, B);

      int count = 0;
      for(Map.Entry<Integer, Integer> pair : mapOfA.entrySet()) {
        Integer valueB = mapOfB.get(pair.getKey());
        if(valueB != null) {
          count+=valueB;
        }
      }

      result[idx] = count;
      idx++;

    }

    return result;

  }

  public static Map<Integer,Integer> getMapOfBetweenArr(int start, int finish, int[]arr) {

    Map<Integer,Integer> map = new HashMap<>();
    while(start <= finish) {
      int key = arr[start];
      Integer value = map.get(key);
      if(value != null) {
        map.put(key, value+1);
      } else {
        map.put(key, 1);
      }
      start++;
    }

    return map;
  }
}
