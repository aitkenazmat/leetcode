package algorithms;

public class Main1365 {

    public static void main(String[] args) {
        int[]nums = new int[]{6,5,4,8};
        int[] rs = smallerNumbersThanCurrent(nums);

        for (int t : rs)
            System.out.println(t);

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[]result = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            int r = method1(nums, i);
            result[i] = r;
        }
        return result;
    }

    public static int method1(int[] nums, int indexWichNeedExclude ) {
        int result = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (i!=indexWichNeedExclude) {
                if (nums[indexWichNeedExclude] > nums[i]) {
                    result++;
                }
            }
        }

        return result;
    }
}
