package algorithms;

public class Main_2243 {
  public static void main(String[] args) {
    System.out.println(digitSum("11111222223", 3));
    System.out.println(digitSum("00000000", 3));
    System.out.println(digitSum("1", 2));
    System.out.println(digitSum("111", 2));
  }

  public static String digitSum(String s, int k) {
    if (s.length() <= k) {
      return s;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i += k) {
      int summ=0;
      for (int j = i; j < i + k; j++) {
        if (j <= s.length()-1) {
          summ+=Integer.parseInt(String.valueOf(s.charAt(j)));
        }
      }
      sb.append(summ);
    }

    if (sb.length() == k) {
      return sb.toString();
    } else {
      return digitSum(sb.toString(), k);
    }
  }
}
