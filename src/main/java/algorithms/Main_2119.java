package algorithms;

import java.util.StringJoiner;

public class Main_2119 {

  public static void main(String[] args) {
    System.out.println(totalMoney(10));
  }



  public static int totalMoney(int n) {

    int to = n /7;
    if (n % 7 !=0) {
      to++;
    }

    int counter = 0;
    int moneyTotal = 0;
    int moneyMonday = 1;
    int moneyCustom = moneyMonday+1;
    for (int i = 0; i < to; i++) {
      if (counter == n) break;

      moneyTotal += moneyMonday;
      counter++;

      for (int j = 0; j < 6; j++) {
        if (counter == n) break;
        moneyTotal+=moneyCustom;
        moneyCustom++;
        counter++;
      }
      moneyMonday++;
      moneyCustom= moneyMonday + 1;
    }

    return moneyTotal;
  }
}
