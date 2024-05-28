package algorithms.array;

public class Main_1848 {
    public static void main(String[] args) {

        int[]nums = new int[]{1,1,1,1,1,1,1,1,1,1};
        int minDistance = getMinDistance(nums, 1, 9);
        System.out.println(minDistance);
    }


    public static int getMinDistance(int[] nums, int target, int start) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == target) {
                return Math.abs(i - start);
            }
        }

        return 0;
    }
}
