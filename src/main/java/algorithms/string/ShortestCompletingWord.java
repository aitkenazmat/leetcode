package algorithms.string;


import java.util.*;

public class ShortestCompletingWord {
    public static void main(String[] args) {

        String[]words = new String[]{"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord("1s3 PSt", words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String search = licensePlate.replaceAll("\\s", "").replaceAll("\\d", "").toLowerCase();
        Map<String, Integer> candidates = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int sumIndex = 0;
            String search1 = search(search, words[i], sumIndex);
            if (search1!=null) {
                String[] split = search1.split("_");
                candidates.put(split[0], Integer.parseInt(split[1]));
            }
        }


        Map.Entry<String, Integer> min = Collections.min(candidates.entrySet(),
                Comparator.comparing(Map.Entry::getValue));


        return min.getKey();

    }

    public static String search(String search,String word, int sumIndex){
        int count = 0;
        for (int i = 0; i < search.length() ; i++) {
            char c = search.charAt(i);
            for (int j = 0; j < word.length() ; j++) {
                if (word.charAt(j) == c) {
                    ++count;
                    sumIndex+=j;
                }
            }
        }

        return search.length() == count ? word+"_"+sumIndex : null ;
    }
}
