package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main_1356 {
  public static void main(String[] args) {
    int[]arr = new int[]{0,1,2,3,4,5,6,7,8};
    sortByBits(arr);
  }

  public static int[] sortByBits(int[] arr) {
    //count, obj from lsit
    Map<Integer, List<Integer> > map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      String binaryStr = Integer.toBinaryString(arr[i]);

      int bitCount = 0;
      for (int j = 0; j < binaryStr.length(); j++) {
        if (binaryStr.charAt(j) == '1') {
          bitCount++;
        }
      }

      List<Integer> elements = map.get(bitCount);
      if (elements==null) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[i]);
        map.put(bitCount, list);
      } else {
        elements.add(arr[i]);
        map.put(bitCount, elements);
      }


    }



    int [] newArr = new int[arr.length];
    int idx = 0;
    for ( Map.Entry<Integer,List<Integer>> entry : map.entrySet()) {
      List<Integer> elemnst = entry.getValue();
      for (Integer el :elemnst) {
        newArr[idx] = el;
        idx++;
      }
    }

    return newArr;
  }
}
