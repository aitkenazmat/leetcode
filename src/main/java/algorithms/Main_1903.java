package algorithms;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Main_1903 {
  public static void main(String[] args) {

    System.out.println(largestOddNumber("35427"));
    System.out.println(largestOddNumber("52"));
    System.out.println(largestOddNumber("4206"));
  }

  public static String largestOddNumber(String num) {

    for (int i = num.length()-1; i >=0 ; i--) {

      if (num.charAt(i) % 2 != 0) {
        return num.substring(0, i +1);
      }

    }

    return "";
  }

  public static boolean odd(BigInteger val) {
    if(!val.mod(new BigInteger("2")).equals(BigInteger.ZERO))
      return true;
    return false;
  }
}
