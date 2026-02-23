package algorithms;

import java.util.*;

public class Main_2418 {
  public static void main(String[] args) {
    String[]names = new String[]{"Mary","John","Emma"};
    int[]heights = new int[]{180,165,170};
    sortPeople(names, heights);
  }

  public static String[] sortPeople(String[] names, int[] heights) {

    Map<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
    for (int i = 0; i < names.length; i++) {
      Integer key = heights[i];
      String val = names[i] ;
      map.put(key, val);
    }

    String[]res = new String[names.length];
    int idx = 0;
    for (Map.Entry<Integer,String> entry :  map.entrySet()) {
      res[idx] = entry.getValue();
      idx++;
    }
    return res;
  }


}
