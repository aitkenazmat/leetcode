package algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main_989 {
    public static void main(String[] args) {

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < num.length; i++) {
            sj.add(String.valueOf(num[i]));
        }

        BigInteger b = new BigInteger(sj.toString());
        BigInteger c = new BigInteger(String.valueOf(k));
        BigInteger r = b.add(c);


        String s = String.valueOf( r.toString());

        List<Integer> list  = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return list;
    }
}
