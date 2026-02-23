package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main_1893 {
  public static void main(String[] args) {

    int[][]matrix = new int[][] { {1,2},{3,4},{5,6} };
    System.out.println(isCovered(matrix, 2, 5));
  }


  public static boolean isCovered(int[][] ranges, int left, int right) {
    boolean leftExist = false;
    for (int i = 0; i < ranges[0].length; i++) {
      if (ranges[0][i] == left) {
        leftExist= true;
        break;
      }
    }
    boolean rightExist = false;
    for (int i = 0; i < ranges[ranges.length-1].length; i++) {
      if (ranges[ranges.length-1][i] == right) {
        rightExist = true;
        break;
      }
    }

    return leftExist && rightExist;
  }

}
