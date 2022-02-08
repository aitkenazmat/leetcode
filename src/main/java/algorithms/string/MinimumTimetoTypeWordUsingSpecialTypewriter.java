package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumTimetoTypeWordUsingSpecialTypewriter {
    public static void main(String[] args) {
//        String s = "abc";
//        String s = "bza";
        String s = "zjpc";
        System.out.println(minTimeToType(s));
    }

    public static int minTimeToType(String word) {

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('a',1);
        map2.put('b',2);
        map2.put('c',3);
        map2.put('d',4);
        map2.put('e',5);
        map2.put('f',6);
        map2.put('g',7);
        map2.put('h',8);
        map2.put('i',9);
        map2.put('j',10);
        map2.put('k',11);
        map2.put('l',12);
        map2.put('m',13);

        Map<Character, Integer> map = new HashMap<>();
        map.put('n',1);
        map.put('o',2);
        map.put('p',3);
        map.put('q',4);
        map.put('r',5);
        map.put('s',6);
        map.put('t',7);
        map.put('u',8);
        map.put('v',9);
        map.put('w',10);
        map.put('x',11);
        map.put('y',12);
        map.put('z',13);




        int totalSum = 0;
        for (int i = 0; i < word.length(); i++) {
            char start = word.charAt(i);
            char next = word.charAt(i+1);
            if (map.get(start)!=null && map.get(next)!=null) {
                totalSum+=Math.abs(map.get(start) + map.get(next) -1);
            } else if (map2.get(start)!=null && map2.get(next)!=null) {
                totalSum+=Math.abs(map2.get(start) + map2.get(next) -1);
            } else if (map.get(start)!=null && map2.get(next)!=null) {
                totalSum+=Math.abs(map.get(start) + map2.get(next) -1);
            } else if (map2.get(start)!=null && map.get(next)!=null) {
                totalSum+=Math.abs(map2.get(start) + map.get(next) -1);
            }
        }

        return totalSum + word.length();
    }



}
