package algorithms.string;

import java.util.LinkedList;
import java.util.List;

public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("aab", "baa"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        List<Integer> indexBlackList = new LinkedList<>();
        for (int i = 0; i < ransomNote.length() ; i++) {
            if (!canConstruct(String.valueOf(ransomNote.charAt(i)), magazine, indexBlackList)) {
                return false;
            }
        }
        return true;
    }


    public static boolean canConstruct(String firstSymbol, String magazine, List<Integer> indexBlackList) {
        for (int i = 0; i < magazine.length(); i++) {
            if (String.valueOf(magazine.charAt(i)).equals(firstSymbol) && !indexBlackList.contains(i)) {
                indexBlackList.add(i);
                return true;
            }
        }
        return false;
    }
}
