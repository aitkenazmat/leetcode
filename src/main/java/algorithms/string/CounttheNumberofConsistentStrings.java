package algorithms.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CounttheNumberofConsistentStrings {
    public static void main(String[] args) {

        String [] words = new String[]{"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings("cad", words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        String[] split = allowed.split("");
        List<String> allowedList = new ArrayList<>(split.length);
        allowedList.addAll(Arrays.asList(split));

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String[] wordArr = words[i].split("");
            boolean isAllowed = true;
            for (int j = 0; j < wordArr.length; j++) {
                String s = wordArr[j];
                if (!allowedList.contains(s)) {
                    isAllowed = false;
                    break;
                }
            }
            if (isAllowed) count++;
        }

        return count;
    }
}
