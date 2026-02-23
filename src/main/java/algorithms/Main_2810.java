package algorithms;

import org.apache.commons.lang3.StringUtils;

public class Main_2810 {

    public static void main(String[] args) {

        System.out.println(finalString("string"));
        System.out.println(finalString("poiinter"));
        System.out.println(finalString("i"));
    }


    public static String finalString(String s) {

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                res.append(s.charAt(i));
            } else {

                res.reverse();
            }
        }

        return res.toString();
    }
}
