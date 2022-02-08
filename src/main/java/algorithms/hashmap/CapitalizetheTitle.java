package algorithms.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class CapitalizetheTitle {
    public static void main(String[] args) {
        System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
        System.out.println(capitalizeTitle("i lOve leetcode"));
    }

    public static String capitalizeTitle(String title) {
        String[] split = title.split(" ");

        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (word.length() <= 2) {
                sj.add(word.toLowerCase());
            } else {
                StringJoiner stringJoiner = new StringJoiner("");
                StringJoiner stringJoiner2 = new StringJoiner("");
                stringJoiner.add(String.valueOf(word.charAt(0)).toUpperCase());
                for (int j = 1; j < word.length(); j++) {
                    stringJoiner2.add(String.valueOf(word.charAt(j)));
                }
                stringJoiner.add(stringJoiner2.toString().toLowerCase());

                sj.add(stringJoiner.toString());
            }
        }

        return sj.toString();


    }
}
