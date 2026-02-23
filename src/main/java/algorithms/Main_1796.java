package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main_1796 {
  public static void main(String[] args) {

    System.out.println(secondHighest("dfa12321afd"));
    System.out.println(secondHighest("abc1111"));
    System.out.println(secondHighest("a"));
    System.out.println(secondHighest("425"));
  }

  public static int secondHighest(String s) {

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 48 && s.charAt(i) <= 57 ) {
        list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
      }
    }

    if (!list.isEmpty()) {
      int f = list.get(0);
      for (int i = 1; i < list.size(); i++) {
        if (list.get(i) > f) {
          return list.get(i);
        }
      }
    }

    return -1;
  }
}
