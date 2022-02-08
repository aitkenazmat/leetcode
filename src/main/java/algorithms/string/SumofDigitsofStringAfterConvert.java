package algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class SumofDigitsofStringAfterConvert {
    public static void main(String[] args) {

        System.out.println(getLucky("iiii", 1));
        System.out.println(getLucky("leetcode", 2));
        System.out.println(getLucky("zbax", 2));
    }

    public static int getLucky(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);


        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < s.length(); i++) {
            Integer integer = map.get(s.charAt(i));
            stringJoiner.add(String.valueOf(integer));
        }

        String summ = summ(stringJoiner.toString(), k);
        return Integer.valueOf(summ);
    }

    public static String summ(String s, int k) {

        while (k>0) {
            int summ = 0;
            for (int i = 0; i < s.length(); i++) {
                summ += Integer.valueOf(String.valueOf(s.charAt(i)) );
            }
            k--;
            return summ(String.valueOf(summ),k);
        }


        return s;

    }
}
