package algorithms.array;

public class Main_2778 {

    public static void main(String[] args) {

        int[]nums = new int[]{1,2,3,4};
        System.out.println(sumOfSquares(nums));
    }

    public static int sumOfSquares(int[] nums) {
        int result= 0;
        int n  = nums.length;

        for (int i = 0; i < n; i++) {

            if (n % (i+1) == 0) {
                double pow = Math.pow(nums[i], 2);
                result+= (int) pow;
            }
        }

        return result;
    }
}
