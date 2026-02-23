package algorithms.hashmap;

public class Main_1640 {

  public static void main(String[] args) {
    int[]arr = new int[]{49,18,16};
    int[][]pieces = new int[][]{ {16,18,49}};
    System.out.println(canFormArray(arr, pieces));
  }
  public static boolean canFormArray(int[] arr, int[][] pieces) {

    StringBuilder str = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      String s = String.valueOf(arr[i]);
      str.append(s);
    }


    StringBuilder str2 = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      Integer val = arr[i];

      for (int j = 0; j < pieces.length; j++) {
        int firstVal = pieces[j][0];

        if (val == firstVal) {
          for (int k = 0; k < pieces[j].length; k++) {
            str2.append(pieces[j][k]);
          }
        }
      }
    }

    return str2.toString().equals(str.toString());


  }
}
