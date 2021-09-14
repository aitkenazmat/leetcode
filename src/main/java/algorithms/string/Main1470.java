package algorithms.string;

public class Main1470 {

    public static void main(String[] args) {


        int[]  nums = new int[]{1,2,3,4,5,6};

        shuffle(nums,3);
    }


    public static int[] shuffle(int[] nums, int n) {
        int [] r = new int[nums.length];
        for (int i = 0, j = 0; i < n ; i++) {
            r[j++] = nums[i];
            r[j++] = nums[i+n];
        }
        return r;
    }
}
