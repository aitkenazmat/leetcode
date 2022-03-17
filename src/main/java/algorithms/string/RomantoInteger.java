package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger     {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);

        int summ = 0;
        for (int i = 0; i < s.length(); i++) {
            Integer integer = map.get(String.valueOf(s.charAt(i)));
            if (i < s.length() - 1) {
                Integer integer2 = map.get(String.valueOf(s.charAt(i+1)));
                if (integer >= integer2) {
                    summ+=integer;
                } else {
                    summ+=integer2-integer;
                    ++i;
                }
            } else {
                summ+=integer;
            }
        }

        return summ;
    }
}
