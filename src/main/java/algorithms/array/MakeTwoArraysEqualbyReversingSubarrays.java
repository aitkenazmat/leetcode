package algorithms.array;

public class MakeTwoArraysEqualbyReversingSubarrays {
    public static void main(String[] args) {

        int[]target = new int[]{172};
        int[]arr = new int[]{84};
        System.out.println(canBeEqual(target, arr));
    }

    public static boolean canBeEqual(int[] target, int[] arr) {

        int totalSum = 0 ;
        for (int i = 0; i < target.length; i++) {
            totalSum+=target[i];
        }

        for (int i = 0; i < arr.length ; i++) {
            int sum = getSum(arr, i);
            if (sum > totalSum) {
                return false;
            }
        }

        return true;
    }

    public static int getSum(int[]arr, int startIndex) {

        int sum = 0;
        for (int i = startIndex; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
