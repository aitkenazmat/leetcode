package algorithms.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountCommonWordsWithOneOccurrence {

    public static void main(String[] args) {

        String[]words1 = new String[]{"leetcode","is","amazing","as","is"};
        String[]words2 = new String[]{"amazing","leetcode","is"};

//        String[]words1 = new String[]{"a","ab"};
//        String[]words2 = new String[]{"a","a","a","ab"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, String> distinct1 = distinct(words1);
        Map<String, String> distinct2 = distinct(words2);
        int count = 0;
        for (Map.Entry<String,String> entry :  distinct1.entrySet()) {
            if (distinct2.get(entry.getKey())!=null) {
                count++;
            }
        }
        return count;
    }

    static Map<String,String> distinct(String[] words){
        List<String> blackList = new LinkedList<>();
        Map<String,String> words1Map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (words1Map.get(words[i])==null && !blackList.contains(words[i])) {
                words1Map.put(words[i],words[i]);
            } else {
                words1Map.remove(words[i]);
                blackList.add(words[i]);
            }
        }
        return words1Map;
    }
}
