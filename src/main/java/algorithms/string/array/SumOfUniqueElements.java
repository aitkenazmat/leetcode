package algorithms.string.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfUniqueElements {

    public static void main(String[] args) {

        int[] elements = new int[]{3,1,1,1,1,2};
        System.out.println(sumOfUnique(elements));

    }

    public static int sumOfUnique(int[] nums) {
        Map<Integer,Integer> integerMap =  new HashMap<>();
        Map<Integer,Integer> blackListMap =  new HashMap<>();
        return sum(nums,0, integerMap,blackListMap);
    }


    public static int  sum(int[] nums, int index, Map<Integer,Integer> integerMap,Map<Integer,Integer> blackListMap){

        if (index >= nums.length) {
            int sum = 0;
            for (Map.Entry<Integer,Integer> entry : integerMap.entrySet()) {
                if (blackListMap.get(entry.getValue())==null) {
                    sum+=entry.getValue();
                }
            }
            return  sum;
        }

        int num = nums[index];
        if (integerMap.get(num)!=null) {
            blackListMap.put(num,num);
            integerMap.remove(num);
        } else {
            integerMap.put(num, num);
        }

        index++;
        return  sum(nums, index, integerMap,blackListMap);

    }
}
