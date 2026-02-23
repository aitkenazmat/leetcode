package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,3,4,5,6,7,4,9,4,4,4};
        System.out.println(maxint(arr));
    }



    public static int maxint(int[]arr) {

        int keyMax = Integer.MIN_VALUE;
        int valueMax = Integer.MIN_VALUE;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int maxVal = 0;
            Integer i1 = map.get(arr[i]);

            if (i1 == null) {
                map.put(arr[i],1);
                maxVal = 1;
            } else {
                maxVal = i1+1;
                map.put(arr[i],++i1);
            }

            if (maxVal > valueMax ) {
                valueMax = maxVal;
                keyMax = arr[i];
            }

        }

        return keyMax;
    }
}
