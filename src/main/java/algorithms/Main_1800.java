package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main_1800 {
    public static void main(String[] args) {
        int[]nums = new int[]{3,6,10,1,8,9,9,8,9};
        maxAscendingSum(nums);
    }


    public static int maxAscendingSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length-1) {
                if (nums[i + 1]<= nums[i]) {
                    summ+=nums[i];
                    list.add(summ);
                    summ= 0;
                } else {
                    summ+=nums[i];
                }
            } else {
                summ+=nums[i];
                list.add(summ);
            }

        }
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        return max.get();
    }
}
