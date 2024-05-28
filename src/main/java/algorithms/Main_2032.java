package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main_2032 {

    public static void main(String[] args) {

    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {


        Set<Integer> integers = new HashSet<>();

        Map<Integer, Integer> map1 = arrToMap(nums1);
        Map<Integer, Integer> map2 = arrToMap(nums2);
        Map<Integer, Integer> map3 = arrToMap(nums3);

        for ( int n : nums1) {
            if (exist(n, map2) || exist(n, map3)) {
                integers.add(n);
            }
        }

        for ( int n : nums2) {
            if (exist(n, map1) || exist(n, map3)) {
                integers.add(n);
            }
        }

        for ( int n : nums3) {
            if (exist(n, map1) || exist(n, map2)) {
                integers.add(n);
            }
        }



        return integers.stream().toList();
    }


    public static boolean exist(Integer val, Map<Integer,Integer> map) {
        return map.get(val) != null;
    }

    public static Map<Integer,Integer> arrToMap(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.putIfAbsent(num, num);
        }
        return map;
    }
}
