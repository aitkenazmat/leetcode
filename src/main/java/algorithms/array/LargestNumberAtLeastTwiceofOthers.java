package algorithms.array;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
//        int[]nums = new int[]{3,6,1,0};
//        int[]nums = new int[]{1,2,3,4};
        int[]nums = new int[]{1};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int maxIndex = getMaxIndex(nums);
        int maxNum = nums[maxIndex];


        for (int i = 0; i < nums.length; i++) {
            if (i!=maxIndex) {
                if (nums[i] * 2 > maxNum) {
                    return -1;
                }
            }
        }

        return maxIndex;
    }

    public static int getMaxIndex(int[]nums) {
        int maxIndex = 0;
        int maxNum = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] > maxNum) {
                maxNum =  nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }


}
