package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Main_2956 {

    public static void main(String[] args) {

    }

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = arrToMap(nums1);
        Map<Integer, Integer> map1 = arrToMap(nums2);

        int i1 = 0;
        int i2 = 0;
        for ( int n : nums1) {
            if (exist(n, map1)) {
                i1++;
            }
        }

        for ( int n : nums2) {
            if (exist(n, map)) {
                i2++;
            }
        }


        return new int[]{i1, i2};

    }


    public static Map<Integer,Integer> arrToMap(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, num);
        }
        return map;
    }


    public static boolean exist(Integer val, Map<Integer,Integer> map) {
        return map.get(val) != null;
    }
}
