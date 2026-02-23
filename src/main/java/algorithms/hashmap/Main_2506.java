package algorithms.hashmap;

import java.util.*;

public class Main_2506 {

  public static void main(String[] args) {

    String[] words = new String[]{"aabb","ab","ba"};

    similarPairs(words);
  }

  public static int similarPairs(String[] words) {

    int count = 0;
    for (int i = 0; i < words.length; i++) {
      String s = jjjj(words[i]);

      for (int j = i+1; j < words.length ; j++) {
        if (jjjj(words[j]).equals(s)) {
          count++;
        }
      }
    }
    return count;
  }

  private static String jjjj(String s) {
    Set<String> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      set.add(String.valueOf(s.charAt(i)));
    }
    String s1  = String.join(",", set);
    Arrays.sort(s1.toCharArray());
    return s1;
  }
}
