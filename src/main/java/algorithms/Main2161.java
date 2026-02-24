package algorithms;

import java.util.LinkedList;

public class Main2161 {
  public static void main(String[] args) {

    int[] arr = {5,4, 3, 2, 1, 5, 9, 8,7,6,5};
    int[] ints = pivotArray2(arr, 5);

    System.out.println("");
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

  public static int[] pivotArray2(int[] nums, int pivot) {

    int[] arr = new int[nums.length];

    int leftIdx = 0;
    int rightIdx = nums.length-1;

   for (int num : nums) {
     if (num < pivot) {
       arr[leftIdx++] = num;
     }
   }

    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] > pivot) {
        arr[rightIdx--] = nums[i];
      }
    }

    while (leftIdx <= rightIdx) {
      arr[leftIdx++] = pivot;
    }



    return arr;

  }
}
