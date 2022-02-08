package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class SumofAllOddLengthSubarrays {
    public static void main(String[] args) {

//        int[]arr = new int[]{1,4,2,5,3};
//        int[]arr = new int[]{1,2};
        int[]arr = new int[]{10,11,12};
        System.out.println(sumOddLengthSubarrays(arr));

    }

    public static int sumOddLengthSubarrays(int[] arr) {

        List<Integer> integers = new LinkedList<>();
        int s = 1;
        while (s <= arr.length) {
            integers.add(s);
            s+=2;
        }
        int sum  = 0;
        for ( Integer x :  integers) {
            sum += summ(arr, x);
        }
        return sum;
    }

    static int summ(int[]arr, int x) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length >= i+x) {
                for (int j = i; j < i+x; j++) {
                    sum+=arr[j];

                }
            }
        }
        return sum;
    }

}
