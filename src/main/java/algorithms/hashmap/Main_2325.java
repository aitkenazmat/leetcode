package algorithms.hashmap;

import java.util.*;

public class Main_2325 {

  public static void main(String[] args) {
    System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
  }

  public static String decodeMessage(String key, String message) {

    StringJoiner sj = new StringJoiner("");
    for (int i = 0; i < key.length(); i++) {
      if ( key.charAt(i) != 32 && !sj.toString().contains(String.valueOf(key.charAt(i)))) {
        sj.add(String.valueOf(key.charAt(i)));
      }
    }

    char a = 'a';
    Map<Character,Character> map  = new HashMap<>();
    for (int i = 0; i < sj.length(); i++) {
      map.put(sj.toString().charAt(i),a);
      if (a == 'z') {
        map.put(sj.toString().charAt(i), a);
        a = 'a';
      }
      a++;
    }

    StringJoiner res = new StringJoiner("");

    for (int i = 0; i < message.length(); i++) {
      if (message.charAt(i) == 32) {
        res.add(" ");
      } else {
        res.add(String.valueOf(map.get(message.charAt(i))));
      }


    }



    return res.toString();
  }
}
