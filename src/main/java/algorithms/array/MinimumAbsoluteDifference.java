package algorithms.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

//        int[]arr = new int[]{4,2,1,3};
        int[]arr = new int[]{1,3,6,10,15};
//        int[]arr = new int[]{3,8,-10,23,19,-4,-14,27};
//        int[]arr = new int[]{40,11,26,27,-20};
        minimumAbsDifference(arr);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAbsDiff = getMin(arr);
        List<List<Integer>> mainIntegers = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> integers = new LinkedList<>();
            if (h(arr, i, minAbsDiff)) {
                integers.add(arr[i]);
                integers.add(arr[i+1]);
                mainIntegers.add(integers);
            }
        }

        return mainIntegers;
    }


    public static int getMin(int[]arr){
        int minAbsDiff = arr[1]-arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(i < arr.length - 1) {
                if (arr[i+1]-arr[i] < minAbsDiff) {
                    minAbsDiff = arr[i+1]-arr[i];
                }
            }

        }
        return minAbsDiff;
    }

    public static boolean h(int[]arr, int index, int minAbsDiff ){
        if (index < arr.length-1) {
            if (arr[index+1]- arr[index] == minAbsDiff) {
                return true;
            }
        }
        return false;
    }


}
