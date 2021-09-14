package algorithms.array;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int[]nums = new int[]{1,2,3,4};
        getConcatenation(nums);
    }

    public static int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length*2];

        for (int i = 0; i < nums.length ; i++) {
            newNums[i]  = nums[i];
            newNums[i+nums.length]  = nums[i];
        }

        return newNums;
    }
}
