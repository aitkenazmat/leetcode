package algorithms.array;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,1,1,3};
//        int[] nums = new int[]{1,1,1,1};
        int[] nums = new int[]{1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }


    public  static int numIdenticalPairs(int[] nums) {
        return numIdenticalPairs(nums,0,0);
    }


    public static int numIdenticalPairs(int[] nums, int i, int count) {

        if (i>=nums.length) {
            return count;
        }

        for (int j = 0; j < nums.length ; j++) {
            if (j!=i) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        i++;
        return numIdenticalPairs(nums, i, count);
    }
}
