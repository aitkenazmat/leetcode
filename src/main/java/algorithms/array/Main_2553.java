package algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class Main_2553 {

    public static void main(String[] args) {
        int[]nums = new int[]{1,2,3,45};
        separateDigits(nums);
    }


    public static int[] separateDigits(int[] nums) {

        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            String nStr = Integer.toString(integer);
            if (nStr.length() == 1) {
                integers.add(nums[i]);
                continue;
            }

            for (int j = 0; j < nStr.length(); j++) {
                int hh = Integer.parseInt(String.valueOf(nStr.charAt(j))) ;
                integers.add(hh);
            }
        }


       int [] arr = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++) {
            arr[i] = integers.get(i);
        }

        return arr;

    }
}
