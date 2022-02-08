package algorithms.array;

import java.lang.reflect.Array;
import java.util.*;

public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,3};
        frequencySort(nums);
    }

    public static int[] frequencySort(int[] nums) {

        Map<Integer,Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (integerMap.get(nums[i])!=null) {
                integerMap.put(nums[i], integerMap.get(nums[i]) + 1);
            } else {
                integerMap.put(nums[i], 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int freq1 = integerMap.get(a);
            int freq2 = integerMap.get(b);

            return freq1 == freq2 ? b - a : freq1 - freq2;
        });

        for(Integer num : integerMap.keySet()) {
            pq.add(num);
        }

        int[] result = new int[nums.length];
        int idx = 0;

        while(!pq.isEmpty()) {
            int num = pq.remove();
            int times = integerMap.get(num);

            while(times-- > 0) {
                result[idx++] = num;
            }
        }



        return result;
    }


    public static void getMin(int[] nums){

    }
}
