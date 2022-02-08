package algorithms.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {

    public static void main(String[] args) {

        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("tveixwaeoezcf"));
        System.out.println(areOccurrencesEqual("fhojjkontbncdhwxbnexplclvjyexzsvqyyhpfpnvhdskuhkuoihiqgalklqketjikdlgrawhfo"));
        System.out.println(areOccurrencesEqual("mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm"));
    }

    public static boolean areOccurrencesEqual(String s) {

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==null) {
                map.put(s.charAt(i),1);
            } else {
                Integer integer = map.get(s.charAt(i));
                map.put(s.charAt(i),integer+1);
            }
        }

        Integer compare = map.get(s.charAt(0));
        for ( Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (!compare.equals(entry.getValue())) {
                return false;
            }
        }

        return true;
    }
}
