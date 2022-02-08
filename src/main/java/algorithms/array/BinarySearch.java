package algorithms.array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,3,5,9,12};

        System.out.println(search(nums, 9));
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
