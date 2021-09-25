package algorithms.array;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {


        int[]nums = new int[]{5,0,1,2,3,4};

        int[] ints = buildArray(nums);

        for ( int o : ints)
            System.out.print(o);

    }

    public static int[] buildArray(int[] nums) {
        int[]ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
