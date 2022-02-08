package algorithms.array;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class FindWordsThatCanBeFormedbyCharacters {
    public static void main(String[] args) {

//        String[] arr = new String[]{"cat","bt","hat","tree"};
        String[] arr = new String[]{"hello","world","leetcode"};
        System.out.println(countCharacters(arr, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        List<Character> targerts = new LinkedList<>();
        for (int i = 0; i < chars.length(); i++) {
            targerts.add(chars.charAt(i));
        }

        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < words.length; i++) {
            String s = countCharacters(words[i], targerts);
            if (s!=null) {
                sj.add(s);
            }

        }

        return sj.length();
    }

    public static String countCharacters(String word, List<Character> targerts) {
        List<Integer> targertsBlackList = new LinkedList<>();
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < word.length(); i++) {
            ggG:
            for (int j = 0; j < targerts.size(); j++) {
                if (word.charAt(i) == targerts.get(j) && !targertsBlackList.contains(j)) {
                    targertsBlackList.add(j);
                    stringJoiner.add(String.valueOf(targerts.get(j)));
                    break ggG;
                }
            }
        }
        return stringJoiner.toString().equals(word) ? word : null;
    }
}
