package algorithms;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main_628 {
  public static void main(String[] args) {
    int[]nums = new int[]{1,2,3,4};
    maximumProduct(nums);
  }


  public static int maximumProduct(int[] nums) {
    PriorityQueue<Integer> poheap = new PriorityQueue<>();
    PriorityQueue<Integer> neheap = new PriorityQueue<>(Collections.reverseOrder());
    for (int num : nums) {
      poheap.offer(num);
      neheap.offer(num);
      if (poheap.size() > 3) {
        poheap.poll();
      }
      if (neheap.size() > 2) {
        neheap.poll();
      }
    }
    int c1 = 1;
    int max = 0;
    while (!poheap.isEmpty()) {
      max = poheap.poll();
      c1 *= max;
    }
    while (!neheap.isEmpty()) {
      max *= neheap.poll();
    }
    return Math.max(c1, max);
  }
}
