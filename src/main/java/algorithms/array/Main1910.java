package algorithms.array;

public class Main1910 {

  public static void main(String[] args) {

    String s = removeOccurrences("ccctltctlltlb", "ctl");
    System.out.println("");
  }

  public static String removeOccurrences(String s, String part) {
    int k = part.length();
    for(int i =0; i <= s.length() -k; i++) {
      if(s.substring(i, i + k).equals(part)) {

        String newS = s.substring(0, i) + s.substring(i+k, s.length());
        if (newS.length() >= k) {
          return removeOccurrences(newS, part);
        } else {
          return newS;
        }
      }
    }

    return s.equals(part) ? "" : s;

  }
}
