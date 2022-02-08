package algorithms.string;

import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class ReformatTheString {
    public static void main(String[] args) {
//        System.out.println(reformat("covid201907"));
        System.out.println(reformat("leetcode1"));
    }

    public static String reformat(String s) {

        List<Integer> integers = new LinkedList<>();
        List<Character> characters = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 97) {
                integers.add(Integer.valueOf(String.valueOf(s.charAt(i))));
            } else {
                characters.add(s.charAt(i));
            }
        }


        int maxSize = Math.max(characters.size(), integers.size());

        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = 0; i < maxSize; i++) {
            if (characters.size() >= integers.size()) {
                stringJoiner.add(String.valueOf(characters.get(i)));
                if (i < integers.size()) {
                    stringJoiner.add(String.valueOf(integers.get(i)));
                }

            } else {
                stringJoiner.add(String.valueOf(integers.get(i)));
                if (i < characters.size()) {
                    stringJoiner.add(String.valueOf(characters.get(i)));
                }

            }
        }



        return stringJoiner.toString().length() == integers.size() + characters.size() ? stringJoiner.toString(): ""  ;
    }
}
