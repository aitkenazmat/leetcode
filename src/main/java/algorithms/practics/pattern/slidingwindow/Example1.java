package algorithms.practics.pattern.slidingwindow;

public class Example1 {

  public static void main(String[] args) {

    // в массиве найти саммую длиную последователность единичек (1)
    // в массиве найти саммую маленкую последователность единичек (1)  min = 2
    String str = "azamatt";
    int k = 2;
    for (int i = 0; i <= str.length() - k; i++) {
      System.out.println(str.substring(i, i + k));
    }




  }
}
