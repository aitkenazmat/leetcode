package algorithms.array;

public class Main_2535 {

  public static void main(String[] args) {
    
  }


  public int differenceOfSum(int[] nums) {

    int sumOfElement = 0;
    int sumOfDigit = 0;

    for (int i = 0; i < nums.length; i++) {
      sumOfElement+=nums[i];

      String s = String.valueOf(nums[i]);
      int digitSum = 0;
      for (int j = 0; j < s.length(); j++) {
        digitSum+= Integer.parseInt(String.valueOf(s.charAt(j)));
      }

      sumOfDigit+=digitSum;
    }

    return sumOfElement - sumOfDigit;

  }
}
