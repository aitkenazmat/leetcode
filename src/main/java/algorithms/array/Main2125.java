package algorithms.array;

public class Main2125 {

  public static void main(String[] args) {
    numberOfBeams(new String[]{"10101", "10111", "11111"});
  }

  public static int numberOfBeams(String[] bank) {

    int prev = 0;
    int total = 0;
    for (String s : bank) {
      int count = 0;
      for (char c : s.toCharArray()) {
        if (c == '1') {
          count++;
        }
      }

      if (count > 0) {
        total += prev * count;
        prev = count;
      }
    }
    return total;
  }
}
