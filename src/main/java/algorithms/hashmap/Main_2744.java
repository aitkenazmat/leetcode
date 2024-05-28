package algorithms.hashmap;

import java.util.StringJoiner;

public class Main_2744 {

    public static void main(String[] args) {

        String[]words = new String[]{"ab","ba","cc"};
        System.out.println(maximumNumberOfStringPairs(words));
    }


    public static int maximumNumberOfStringPairs(String[] words) {

        int count = 0 ;
        for (int i = 0; i < words.length; i++) {
            String s1 = words[i];

            for (int j = i+1; j < words.length ; j++) {
                String s2 = words[j];
                String reverse = reverse(s2);

                if (reverse.equals(s1)) {
                    count++;
                }

            }
        }

        return count;
    }

    static String reverse(String s) {

        StringJoiner sj = new StringJoiner("");
        for (int i = s.length()-1; i >= 0 ; i--) {
            sj.add(String.valueOf(s.charAt(i)));
        }

        return sj.toString();

    }
}
