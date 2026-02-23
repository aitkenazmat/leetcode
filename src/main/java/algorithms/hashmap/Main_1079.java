package algorithms.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_1079 {
  public static void main(String[] args) {
    numTilePossibilities("abc");
  }


  public static int numTilePossibilities(String tiles) {

    List<String> blackList= new ArrayList<>();
    rec(blackList, 0, String.valueOf(tiles.charAt(0)), tiles);
    return 0;

  }


  public static void rec(List<String> blackList, int ignoreIndex, String s, String tiles) {

    if (!blackList.contains(s)) {
      Set<String> set = new HashSet<>();
      for (int i = 0; i < tiles.length(); i+=2) {
        String str = String.valueOf(tiles.charAt(i));
        set.add(str);
        blackList.add(str);

        str+=tiles.charAt(i+1);

        rec(blackList, i, str, tiles);
      }
    }

  }
}
