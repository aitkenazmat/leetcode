package algorithms.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main_2309 {

  public static void main(String[] args) {

    System.out.println(greatestLetter("elETcOdE"));
  }

  public static String greatestLetter(String s) {
    char[] arr = s.toCharArray();
    Arrays.sort(arr);

    Map<Character,Character> map = new HashMap<>();
    String res = "";
    for (int i = 0; i < arr.length; i++) {
      char chr = arr[i];
      if (Character.isUpperCase(chr)) {
        map.put(chr,chr);
      } else {
        char c  = (char) (chr - 32);
        Character value = map.get(c);
        if (value != null) {
          res =  String.valueOf(value);
        }
      }
    }
    return res;
  }
}
