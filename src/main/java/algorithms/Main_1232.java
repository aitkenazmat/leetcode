package algorithms;

public class Main_1232 {

  public static void main(String[] args) {

    int[][] coordinates = new int[][]{{1,2},{2,3},{3,3}};
    checkStraightLine(coordinates);
  }

  public static boolean checkStraightLine(int[][] coordinates) {
    if (coordinates.length == 2) {
      return true;
    }

    int k = coordinates[0][0];
    int j = coordinates[0][1];
    for (int i = 1; i < coordinates.length; i++) {
      if (coordinates[i][1] - j != 1) {
        return false;
      } else {
        j = coordinates[i][1];
      }

      if (coordinates[i][0] <=k) {
        return false;
      } else {
        k = coordinates[i][0];
      }
    }

    return true;
  }
}
