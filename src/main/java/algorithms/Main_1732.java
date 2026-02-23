package algorithms;

public class Main_1732 {
  public static void main(String[] args) {

//    int[]gain = new int[]{-5,1,5,0,-7};
    int[]gain = new int[]{-4,-3,-2,-1,4,3,2};
    System.out.println(largestAltitude(gain));
  }

  public static int largestAltitude(int[] gain) {
    int maxAltitude = 0;
    int depth = 0;
    for (int i = 0; i < gain.length; i++) {
      depth = depth + gain[i];
      if (depth > maxAltitude) {
        maxAltitude = depth;
      }
    }
    return maxAltitude;
  }
}
