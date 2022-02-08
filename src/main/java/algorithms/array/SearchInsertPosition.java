package algorithms.array;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[]nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;

        int a = 0;
        while (a < nums.length) {
            if (target <= nums[a]) {
                return a;
            } else {
                a++;
            }
        }
        return a;
    }
}
