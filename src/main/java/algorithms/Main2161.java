package algorithms;

import java.util.LinkedList;

public class Main2161 {
  public static void main(String[] args) {

   // pivotArray(int[]{}, 10);
  }

  public static int[] pivotArray(int[] nums, int pivot) {

    java.util.List<Integer> l1 = new LinkedList<>();
    java.util.List<Integer> l2 = new LinkedList<>();
    java.util.List<Integer> l3 = new LinkedList<>();


    for(int num : nums) {
      if (num < pivot) {
        l1.add(num);
      } else if (num > pivot) {
        l3.add(num);
      } else {
        l2.add(num);
      }
    }

    int[] arr = new int[nums.length];

    int idx = 0;

    for(int n : l1) {
      arr[idx++] = n;
    }

    for(int n : l2) {
      arr[idx++] = n;
    }

    for(int n : l3) {
      arr[idx++] = n;
    }

    return arr;
  }
}
