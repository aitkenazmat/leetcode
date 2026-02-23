package algorithms.hashmap;

import java.util.Set;

public class Main_2399 {

  public static void main(String[] args) {
    int[] distance = new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    System.out.println(checkDistances("abaccb", distance));
  }

  public static boolean checkDistances(String s, int[] distance) {

    for (int i = 0; i < distance.length; i++) {
      int dis = distance[i];

      char c = s.charAt(i);
      int d = 0;
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(j) == c) {
          if (d != dis) {
            return false;
          }
        }
        d++;
      }
    }
    return true;
  }
}
