package algorithms;

public class Main_1984 {
  public static void main(String[] args) {
    int[]nums = new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println(minimumDifference(nums, 2));
  }

  public static int minimumDifference(int[] nums, int k) {

    if (k==1){
      return 0;
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i <= nums.length - k; i++) {
      System.out.println(nums[i]);
      for (int j = i+1; j < nums.length; j++) {
        System.out.println(nums[j]);
      }
      System.out.println("---");
    }
    return min;
  }
}
