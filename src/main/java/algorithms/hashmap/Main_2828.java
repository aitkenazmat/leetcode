package algorithms.hashmap;

import java.util.List;
import java.util.StringJoiner;

public class Main_2828 {

    public static void main(String[] args) {

    }

    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }

        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < words.size(); i++) {
            char ch = words.get(i).charAt(0);
            sj.add(String.valueOf(ch));
        }

        return s.equals(sj.toString());
    }
}
