package algorithms.array;

public class Main_2574 {


  public static void main(String[] args) {

    int[]nums = new int[]{10,4,8,3};
    leftRigthDifference(nums);
  }


  public static int[] leftRigthDifference(int[] nums) {

    int[]answer = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {

      int left = 0;
      for (int j = 0; j < i; j++) {
        left+=nums[j];
      }
      int right = 0;

      for (int j = i+1; j < nums.length; j++) {
        right+=nums[j];
      }

      answer[i] = left > right ? left - right: right - left;
    }

    return answer;

  }
}
