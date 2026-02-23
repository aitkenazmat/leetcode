package algorithms.tree;

import java.util.List;

public class Main_2415 {

  public static void main(String[] args) {
    getNoZeroIntegers(10);
  }

  public static int[] getNoZeroIntegers(int n) {
    return getNoZeroIntegers(n,1);
  }

  public static int[] getNoZeroIntegers(int n, int a) {
    int b = n - a;
    String bStr = String.valueOf(b);
    if (String.valueOf(a).contains("0") || bStr.contains("0")) {
      a++;
      return getNoZeroIntegers(n, a);
    } else {
      int[]arr = new int[2];
      arr[0] = a;
      arr[1] = b;
      return arr;
    }
  }
}
