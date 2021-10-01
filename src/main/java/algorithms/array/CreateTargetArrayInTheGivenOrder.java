package algorithms.array;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {

        int[]nums = new int[]{0,1,2,3,4};
        int[]index = new int[]{0,1,2,2,1};
        createTargetArray(nums,index);
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        for (int i = 0; i < nums.length ; i++) {
            index[i] = nums[i];
            for (int j = i; j < index.length ; j++) {
                index[j] = nums[j];
            }


        }

        return index;

    }
}
