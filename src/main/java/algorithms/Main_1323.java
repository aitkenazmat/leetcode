package algorithms;

import java.util.StringJoiner;

public class Main_1323 {
    public static void main(String[] args) {

    }

    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringJoiner sj = new StringJoiner("");
        boolean founded = false;
        for (int i = 0; i < s.length(); i++) {
            if (!founded && String.valueOf(s.charAt(i)).equals("6")) {
                sj.add("9");
                founded = true;
            } else {
                sj.add(String.valueOf(s.charAt(i)));
            }
        }
        return Integer.parseInt(sj.toString());
    }
}
