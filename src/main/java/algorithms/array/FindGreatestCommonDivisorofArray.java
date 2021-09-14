package algorithms.array;

import java.math.BigInteger;

public class FindGreatestCommonDivisorofArray {
    public static void main(String[] args) {
        int[] array = new int[]{3,3};
        System.out.println(findGCD(array));

    }

    public static int findGCD(int[] nums) {
        int max = getMax(nums);
        int min = getMin(nums);
        return gcdThing(max, min);
    }


    public static  int getMax (int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        return max;
    }

    public static  int getMin (int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (min > nums[i])
                min = nums[i];
        }
        return min;
    }

    private static int gcdThingCustom(int a, int b , int d) {
        if (a % d !=  0 &&  b % d != 0) {
            ++d;
        } else {
            ++d;
            gcdThingCustom(a, b, d);
        }

        return d;
    }

    private static int gcdThing(int a, int b) {
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
}
