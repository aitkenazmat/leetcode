package algorithms.array;

import java.util.*;
import java.util.stream.IntStream;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{10,5,11,9,4,5,11};
//        int[] nums = new int[]{3,2,1};
//        int[] nums = new int[]{1,1,2};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        List<Integer> intList = getIntList(nums);
        Set<Integer> intUniqueList = getIntUniqueList(nums);
        return getMax(intList,intUniqueList,0 );
    }


    public static int getMax(List<Integer> intList, Set<Integer> intUniqueList, int count ) {
        if (intUniqueList.size() >= 3) {
            count++;
            Integer removeInteger = intList.get(intList.size() - 1);
            intList.removeAll(Arrays.asList(removeInteger));
            if (count == 2) {
                return intList.get(intList.size() - 1);
            } else{
                return getMax(intList,intUniqueList,count);
            }

        } else{
            return  intList.get(intList.size() - 1);
        }

    }

    public static List<Integer> getIntList(int[] nums) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        Collections.sort(integers);
        return integers;
    }

    public static Set<Integer> getIntUniqueList(int[] nums) {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        return integers;
    }
}
