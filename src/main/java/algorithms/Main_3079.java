package algorithms;

import java.util.Arrays;

public class Main_3079 {

    public static void main(String[] args) {

        int[]nums = new int[]{1,2,3};
        int i = sumOfEncryptedInt(nums);
        System.out.println(i);
    }

    public static int sumOfEncryptedInt(int[] nums) {

        Integer total = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = regenNum(nums[i]);
            total+=Integer.valueOf(s);
        }


        return total;
    }

    public static String regenNum(int n) {
        String s = String.valueOf(n);
        String[]arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(arr);

        String v = arr[arr.length-1];

        String response = "";

        for (int i = 0; i < arr.length; i++) {
            response+=v;
        }

        return response;
    }
}
