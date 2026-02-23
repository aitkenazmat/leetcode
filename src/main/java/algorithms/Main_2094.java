package algorithms;

import java.util.*;
import java.util.List;

public class Main_2094 {


  public static void main(String[] args) {
   int[]digits  = new int[]{2,1,3,0};
    findEvenNumbers(digits);
  }

  public static int[] findEvenNumbers(int[] digits) {

    Map<Integer,Integer> integers = new TreeMap<>();
    for (int i = 0; i < digits.length; i++) {
      for (int j = 0; j < digits.length; j++) {
        for (int k = 0; k < digits.length; k++) {
          Set<Integer> set = new HashSet<>();
          set.add(i);
          set.add(j);
          set.add(k);
          if (set.size() == 3) {
            int i1 = Integer.parseInt(String.valueOf(digits[i]) + digits[j] + digits[k]);
            if (i1 % 2 == 0 && String.valueOf(i1).length() == 3) {
              integers.putIfAbsent(i1,i1);
            }
          }
        }
      }
    }

    int[]arr = new int[integers.size()];

    int idx= 0;

    for (Map.Entry<Integer,Integer> entry : integers.entrySet()) {
      arr[idx] = entry.getKey();
      idx++;
    }

    return arr;
  }
}
