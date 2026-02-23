package algorithms;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Main_66 {
    public static void main(String[] args) {
        int[] digits = new int[]{1,2,3};
        int[]arr = plusOne(digits);
        System.out.println("");
    }

    public static int[] plusOne(int[] digits) {

        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < digits.length; i++) {
            sj.add(String.valueOf(digits[i]));
        }
        BigInteger b = new BigInteger(sj.toString());
        BigInteger one = new BigInteger("1");
        BigInteger r = b.add(one);

        int[]arr = new int[r.toString().length()];
        for (int i = 0; i < r.toString().length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(r.toString().charAt(i)));
        }
        return arr;
    }
}
