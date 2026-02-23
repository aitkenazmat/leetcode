package algorithms;

public class Main_1004 {

  public static void main(String[] args) {

//    int[]nums = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    int[]nums = new int[]{0,6,5,2,2,5,1,9,4};
    System.out.println(maxSumTwoNoOverlap(nums, 1,2));
  }


  public static int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
    int s = getMax(nums, firstLen, -1);
    return -1;
  }


  static int getMax(int[] nums, int k, int ignoreIndex) {
    int max = 0;
    for (int i = 0; i <= nums.length - k; i++) {
      int sum = 0;
      for (int j = i; j < i + k; j++) {
        sum+=nums[j];
      }
      if (max < sum) {
        max = sum;
      }
    }

    return max;
  }

  public static int longestOnes(int[] nums, int k) {
    for (int i = 0; i <= nums.length - k; i++) {

      for (int j = i; j < i + k ; j++) {
        System.out.println(nums[j]);
      }
      System.out.println("--");
    }

    return -1;
  }
}
