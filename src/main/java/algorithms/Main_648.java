package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main_648 {
    public static void main(String[] args) {
//        List<String> dictionary = List.of("cat","bat","rat");
        List<String> dictionary = List.of("catt","cat","bat","rat");
//        String sentence = "aadsfasf absbs bbab cadsfafs";
        String sentence = "the cattle was rattled by the battery";
        String s = replaceWords(dictionary, sentence);
        System.out.println(s);
    }

    public static String replaceWords(List<String> dictionary, String sentence) {

        String[]words  = sentence.split(" ");
        StringJoiner sj = new StringJoiner(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            List<String> candidates = new ArrayList<>();
            for (String d :  dictionary) {
                if (word.length()>=d.length()) {
                    String r = word.substring(0, d.length());
                    if (d.equals(r)) {
                        candidates.add(d);
                    }
                }
            }
            if (!candidates.isEmpty()) {
                String r = candidates.get(0);
                for (int j = 0; j < candidates.size(); j++) {
                    if (candidates.get(j).length() < r.length()) {
                        r = candidates.get(j);
                    }
                }
                sj.add(r);
            } else {
                sj.add(word);
            }

        }
        return sj.toString();
    }
}
