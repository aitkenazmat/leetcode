package algorithms.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
//        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
//        System.out.println(checkIfPangram("leetcode"));
        System.out.println(checkIfPangram("jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo"));
    }


    public static boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length ; i++) {
            set.add(chars[i]);
        }

        return set.size() == 26;
    }
}
