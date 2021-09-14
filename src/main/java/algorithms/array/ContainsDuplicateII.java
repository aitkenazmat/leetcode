package algorithms.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4,0,0,7,8,9,10,11,12,0};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }




    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size() ; i++) {
            Integer integer = list.get(i);
            if (check(list.subList(i+1,list.size()), integer)) {
                for (Integer integer1: list) {
//                    if (integer.equals(integer1))
                }

                if (Math.abs(i-(list.lastIndexOf(integer)))<=k) {
                    result = true;
                } else result = false;
            }
        }
        return result;
    }

    public static boolean check(List<Integer> integers, Integer integer) {
        return integers.contains(integer);
    }


}
