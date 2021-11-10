package algorithms.stack;

import java.util.LinkedList;
import java.util.List;

public class NextGreaterElementI {
    public static void main(String[] args) {
//        int[]nums1 = new int[]{4,1,2};
//        int[]nums2 = new int[]{1,3,4,2};

        int[]nums1 = new int[]{2,4};
        int[]nums2 = new int[]{1,2,3,4};
        nextGreaterElement(nums1,nums2);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]res = new int[nums1.length];

        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            integers.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            int i1 = integers.indexOf(nums1[i]);
            if (i1!=-1) {
                int greaterElement = -1;
                for (int j = i1; j < nums2.length; j++) {
                    if (nums2[j] > nums2[i1]) {
                        greaterElement = nums2[j];
                        break;
                    }
                }
                res[i] = greaterElement;
            }
        }

        return res;
    }
}
