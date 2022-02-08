package algorithms.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindLuckyIntegerinanArray {
    public static void main(String[] args) {

//        int[]arr = new int[]{2,2,3,4};
//        int[]arr = new int[]{1,2,2,3,3,3};
        int[]arr = new int[]{2,2,2,3,3};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer value = map.get(arr[i]);
            if ( value != null ) {
                map.put(arr[i], value + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int max = -1 ;
        for ( Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                if ( entry.getKey() > max) {
                    max = entry.getKey();
                }
            }
        }
        return max;
    }
}
