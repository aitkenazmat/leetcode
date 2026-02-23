package algorithms;

public class Main_507 {

  public static void main(String[] args) {
    checkPerfectNumber(2016);
  }

  public static boolean checkPerfectNumber(int num) {
    int sum = 0;
    boolean loop = true;
    int i  = 1;
    while (loop) {
      if (num % i == 0) {
        sum+=i;
      }
      if (sum==num) {
        return true;
      }
      if (sum>num) {
        return false;
      }
      i++;
    }
    return sum==num;
  }

}
