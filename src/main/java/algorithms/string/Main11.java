package algorithms.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * https://leetcode.com/problems/container-with-most-water/
 * 11. Container With Most Water
 *
 */
public class Main11 {
    public static void main(String[] args) {
        int[] heights = new  int[]{1,8,6,2,5,4,8,3,7};
        int length = heights.length / 2;


        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i <length ; i++) {
            map1.put(i, heights[i]);
            //System.out.println(heights[i]);
        }
        System.out.println("---------");

        for (int i = length; i <heights.length ; i++) {
            map2.put(i, heights[i]);
           // System.out.println(heights[i]);
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry :  map1.entrySet()) {
            int value = entry.getValue();
        }

        System.out.println("max: " + max);

        String sss = null;
    }




    public static int maxArea(int[] heights) {
//        int maxElementIndex = getMaxElementIndex(heights);
//        int [] newArr =  reGenerateCurrentArray(heights, maxElementIndex);
//        int tmpIndex = getMaxElementIndex2(newArr);
//
//
//        System.out.println("maxElementIndex: " + heights[maxElementIndex]  + " index " +maxElementIndex );
//        System.out.println("maxElementIndex1: " + newArr[tmpIndex]  + " index " +tmpIndex );
        return 0;
    }

    private static int[] reGenerateCurrentArray(int[] heights, int maxElementIndex) {
        int[] arr = new int[heights.length-1];

        for (int i = 0,  j = 0; i < heights.length; i++) {
            if (i!=maxElementIndex) {
                arr[j++] = heights[i];
            }
        }

        return arr;
    }




    public static int getMaxElementIndex(int[] heights){
        int maxElement = heights[0];
        int maxElementIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (maxElement < heights[i]) {
                maxElement = heights[i];
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    public static int getMaxElementIndex2(int[] heights){
        int maxElement = heights[0];
        int maxElementIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (maxElement <= heights[i]) {
                maxElement = heights[i];
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }
}
