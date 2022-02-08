package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class DetermineifStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
        System.out.println(halvesAreAlike("textbook"));
        System.out.println(halvesAreAlike("MerryChristmas"));
    }

    public static boolean halvesAreAlike(String s) {
        Map<Character, Character> vowelsMap = new HashMap<>();
        vowelsMap.put('a','a');
        vowelsMap.put('A','A');
        vowelsMap.put('e','e');
        vowelsMap.put('E','E');
        vowelsMap.put('i','i');
        vowelsMap.put('I','I');
        vowelsMap.put('O','O');
        vowelsMap.put('o','o');
        vowelsMap.put('u','u');
        vowelsMap.put('U','U');

        String substring1 = s.substring(0, s.length() / 2);
        String substring2 = s.substring(s.length() / 2 );
        int countVowels1 = getCountVowels(substring1,vowelsMap);
        int countVowels2 = getCountVowels(substring2,vowelsMap);
        return countVowels2 == countVowels1;

    }

    public static int getCountVowels(String s,Map<Character, Character> vowelsMap) {


        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowelsMap.get(s.charAt(i))!=null) {
                count++;
            }
        }
        return count;
    }
}
