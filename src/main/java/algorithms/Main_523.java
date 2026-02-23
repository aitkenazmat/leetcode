package algorithms;

public class Main_523 {
  public static void main(String[] args) {

    int[]nums = new int[]{1,0};
    checkSubarraySum(nums, 2);
  }

  public static boolean checkSubarraySum(int[] nums, int k) {
    for (int j = 0; j < nums.length; j++) {
      int sum = nums[j];

      for (int l = j ; l < nums.length ; l++) {
        sum+=nums[l];
      }
      if ( sum % k == 0) {
        return true;
      }

      if (sum==0) {
        return true;
      }
    }
    return false;

  }
}
