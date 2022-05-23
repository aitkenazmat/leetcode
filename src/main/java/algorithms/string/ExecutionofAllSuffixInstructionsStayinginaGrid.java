package algorithms.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ExecutionofAllSuffixInstructionsStayinginaGrid {

  public static void main(String[] args) {
//    int[] rrddlus = executeInstructions(3, new int[]{0,1}, "RRDDLU");
//    int[] rrddlus = executeInstructions(2, new int[]{1,1}, "LURD");
    int[] rrddlus = executeInstructions(1, new int[]{0,0}, "LRUD");
    for (int i: rrddlus) {
      System.out.print(i);
    }
  }

  public static int[] executeInstructions(int n, int[] startPos, String s) {
    int x  = startPos[1]; // R L
    int y  = startPos[0]; // U D

    List<Integer> integers = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      StringJoiner sj = new StringJoiner("");
      for (int j = i; j < s.length(); j++) {
        sj.add(String.valueOf(s.charAt(j)));
      }
      integers.add(str(sj.toString(), n, x, y));
    }

    int[] arr = new int[integers.size()];
    for (int i = 0; i < integers.size(); i++) {
      arr[i] = integers.get(i);
    }
    return arr;
  }

  static int str(String s, int n, int x , int y) {
    int c = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'R') {
        x = x + 1;
        if ( x < n ) {
          c++;
        } else {
          return c;
        }
      }

      if (s.charAt(i) == 'L') {
        x = x - 1;
        if ( x <= n && x > -1) {
          c++;
        } else {
          return c;
        }
      }

      if (s.charAt(i) == 'U') {
        y = y - 1;
        if ( y <= n && y > -1 ) {
          c++;
        } else {
          return c;
        }
      }

      if (s.charAt(i) == 'D') {
        y = y + 1;
        if ( y < n ) {
          c++;
        } else {
          return c;
        }
      }
    }

    return c;
  }

}
