package algorithms;

public class Main_504 {
  public static void main(String[] args) {

  }

  public String convertToBase7(int num) {
    int  count = 0;
    int  res = 0;

    while(num != 0) {
      int dig = num % 7;
      res += dig * (int) Math.pow(10, count);
      count++;
      num = num / 7;
    }
    return Integer.toString(res);
  }
}

