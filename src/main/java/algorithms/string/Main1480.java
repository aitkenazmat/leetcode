package algorithms.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main1480 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2,10,1};
        int[] ints = runningSum(nums);

        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static int[] runningSum(int[] nums) {
        return IntStream.range(0, nums.length).map(i -> getSumm(i, nums)).toArray();
    }

    public static int getSumm(int index, int[] nums){
        if (index!=0) {
            int count = 0;
            for (int i = 0; i <= index ; i++) {
                count+=nums[i];
            }

            return count;

        } else {
            return nums[0];
        }
    }
}
