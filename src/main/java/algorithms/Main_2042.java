package algorithms;

import java.util.StringJoiner;

public class Main_2042 {


    public static void main(String[] args) {
        System.out.println(areNumbersAscending("hello world 5 x 5"));
    }


    public static boolean areNumbersAscending(String s) {

        int current =Integer.MIN_VALUE;
        boolean init = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <=57) {
                StringJoiner sj = new StringJoiner("");
                for (int j = i; j <= s.length(); j++) {
                    if (s.charAt(j) >= 48 && s.charAt(j) <=57) {
                        sj.add(String.valueOf(s.charAt(j)));
                    } else {
                        i = j+1;
                        int res = Integer.parseInt(sj.toString());

                        if (!init) {
                            init = true;
                            current = res;
                        } else {
                            if (res <= current) {
                                return false;
                            } else {
                                current = res;
                            }
                        }
                        break;
                    }
                }
            }
        }

        return true;
    }
}
