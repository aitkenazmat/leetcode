package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main_1202 {


  public static void main(String[] args) {

    List<List<Integer>> pairs = new ArrayList<>();

    List<Integer> int1 = new ArrayList<>();
    int1.add(0);
    int1.add(3);
    List<Integer> int2 = new ArrayList<>();
    int2.add(1);
    int2.add(2);

    pairs.add(int1);
    pairs.add(int2);


    System.out.println(smallestStringWithSwaps("dcab", pairs));
  }

  public static String smallestStringWithSwaps(String s, java.util.List<List<Integer>> pairs) {
    return smallestStringWithSwaps(s, pairs, 0);
  }


  public static String smallestStringWithSwaps(String s, java.util.List<List<Integer>> pairs, int idx) {


    if (pairs.size() -1 > idx) {

      List<Integer> pair = pairs.get(idx);

      int a = pair.get(0);
      int b = pair.get(1);

      char[]arr = s.toCharArray();
      char aVal = arr[a];
      char bVal = arr[b];

      char[]newArr = new char[arr.length];
      for (int j = 0; j < arr.length; j++) {
        if (j == a) {
          newArr[j] = bVal;
        } else if ( j == b) {
          newArr[j] = aVal;
        } else {
          newArr[j] = arr[j];
        }
      }

      String string = new String(newArr);
      idx++;

      return smallestStringWithSwaps(string, pairs, idx);
    }

    return "";
  }
}
