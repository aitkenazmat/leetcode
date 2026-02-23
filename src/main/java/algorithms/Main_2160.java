package algorithms;

import java.util.Arrays;

public class Main_2160 {
  public static void main(String[] args) {

  }

  public int minimumSum(int num) {

    int[]arr = new int[4];
    int i = 0;
    while (num > 0) {
      arr[i++] = num % 10;
      num /= 10;
    }
    Arrays.sort(arr);


    int i1  = arr[0] * 10 + arr[2] ;
    int i2  = arr[1] * 10 + arr[3]  ;

    return i1 + i2;
  }
}
