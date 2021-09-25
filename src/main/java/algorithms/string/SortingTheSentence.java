package algorithms.string;

import java.util.Arrays;

public class SortingTheSentence {

    public static void main(String[] args) {
        String s = "ca3 ba2 ww1";
        System.out.println(sortSentence(s));
    }

    public  static String sortSentence(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = new String[s1.length];
        if (s1.length <= 9 ) {

            for (int i = 0; i < s1.length; i++) {
                StringBuilder sb = new StringBuilder();
                //
                String substring1= s1[i].substring(s1[i].length() - 1);
                String substring2 = s1[i].substring(0, s1[i].length() - 1);
                sb.append(substring1).append("_").append(substring2 + " ");
                s2[i] = sb.toString();
            }
            Arrays.sort(s2);

            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s2.length ; i++) {
                String[] s3 = s2[i].split("_");
                res.append(s3[1]);

            }
            return res.toString().trim();
        }

        return s;
    }
}



