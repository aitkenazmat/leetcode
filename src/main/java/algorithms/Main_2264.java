package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main_2264 {

  public static void main(String[] args) {

    largestGoodInteger("3200014888");
  }


  public static String largestGoodInteger(String num) {
    int k = 3;
    String strMax = "";
    int max = Integer.MIN_VALUE;
    for (int i = 0; i <= num.length() - k  ; i++) {
      String s = num.substring(i, i + k);
      if (s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2)) {
        int d = Integer.parseInt(String.valueOf(s.charAt(0)));

        if (d > max) {
          max = d;

          strMax = s;
        }
      }
    }
    return strMax;
  }
}
