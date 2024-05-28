package algorithms.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args) {

        int[] arr = new int[]{1,1,1,2,2,3};

        topKFrequent(arr, 2);
    }


    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map  = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.get(nums[i]) != null) {
                int currentCount = map.get(nums[i]);
                map.put(nums[i], currentCount + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()>=k) {
                list.add(entry.getKey());
            }
        }

        int[]arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
