package algorithms.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class LongestPalindromicSubstring {

  public static void main(String[] args) {
    System.out.println(longestPalindrome("aacabdkacaa"));
  }


  public static String longestPalindrome(String s) {
    if (s.length() ==1) {
      return s;
    }
    List<String> result = new ArrayList<>();
    String s1 = longestPalindrome(s, 0, 0, result);
    return s1;
  }

  public static String longestPalindrome(String s, int start, int level, List<String> result) {
    int finsih = s.length()-1;
    boolean next = true;
    while (start < finsih) {
      char c = s.charAt(start);
      char c1 = s.charAt(finsih);
      if (c==c1) {
        next = false;
        break;
      } else {
        finsih--;
      }
    }

    if (start==finsih && level==s.length()-1 ) {
      return String.valueOf(s.charAt(0));
    }

    String r = s.substring(start, finsih +1);
    if (isPalindrom(r) && !next) {
      System.out.println(r);
      result.add(r);
      return longestPalindrome(s, ++start, ++level, result);
    } else {
      return longestPalindrome(s, ++start, ++level, result);
    }
  }

  static boolean isPalindrom(String s ) {
    StringJoiner sj = new StringJoiner("");
    for (int i = s.length()-1; i >= 0 ; i--) {
      sj.add(String.valueOf(s.charAt(i)));
    }
    return sj.toString().equals(s);
  }
}
