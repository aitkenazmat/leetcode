package algorithms.hashmap;

public class Main_1400 {
  public static void main(String[] args) {
    System.out.println(isPalindrome("azamat"));
    System.out.println(isPalindrome("aza"));
    System.out.println(isPalindrome("azza"));
    System.out.println(isPalindrome("azfa"));
    System.out.println(isPalindrome("a"));
  }

  public boolean canConstruct(String s, int k) {

    for (int i = 0; i < k; i++) {

    }

    return true;
  }


  public static boolean isPalindrome(String s) {
    for (int i = 0; i < s.length(); i++) {
      char first = s.charAt(i);
      char sec = s.charAt(s.length()-1 - i);
      if (first != sec) {
        return false;
      }
    }
    return true;
  }
}
