package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[]nums1 = new int[]{1,2,2,1};
        int[]nums2 = new int[]{2,2};
        System.out.println(intersection(nums1, nums2));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !list.contains(nums1[i]) ) {
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        int arr[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;

    }
}
