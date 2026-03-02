package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main1630 {
  public static void main(String[] args) {

    List<Boolean> booleans = checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5});
    System.out.println("");

  }

  public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

    List<Boolean> result = new ArrayList<>();
    for (int i = 0; i < r.length; i ++) {
      int arr[] = get(nums, l[i], r[i]);
      int diff = arr[1] - arr[0];

      boolean res = true;
      for(int j = 0; j < arr.length; j++) {
        if (j <=arr.length-2 &&  arr[j] + diff  != arr[j+1]) {
          res = false;
          break;
        }
      }

      result.add(res);
    }

    return result;
  }


  public  static int[] get(int[] nums, int leftIdx, int rightIdx) {
    int[]arr = new int[(rightIdx - leftIdx) +1];
    int idx = 0;
    for(int i = leftIdx; i <=rightIdx; i++) {
      arr[idx] =  nums[i];
      idx++;
    }
    Arrays.sort(arr);
    return arr;
  }
}
