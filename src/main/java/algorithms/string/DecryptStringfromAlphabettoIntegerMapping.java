package algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class DecryptStringfromAlphabettoIntegerMapping {
    public static void main(String[] args) {

//        System.out.println(freqAlphabets("10#11#12"));
//        System.out.println(freqAlphabets("25#"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
//        System.out.println(freqAlphabets("1326#"));

    }

    public static String freqAlphabets(String s) {

        Map<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","d");
        map.put("5","e");
        map.put("6","f");
        map.put("7","g");
        map.put("8","h");
        map.put("9","i");

        map.put("10", "j");
        map.put("11", "k");
        map.put("12", "l");
        map.put("13", "m");
        map.put("14", "n");
        map.put("15", "o");
        map.put("16", "p");
        map.put("17", "q");
        map.put("18", "r");
        map.put("19", "s");
        map.put("20", "t");
        map.put("21", "u");
        map.put("22", "v");
        map.put("23", "w");
        map.put("24", "x");
        map.put("25", "y");
        map.put("26", "z");


        StringJoiner response = new StringJoiner("");
        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!= '#') {
                sj.add(String.valueOf(s.charAt(i)));
            } else {
                if (sj.toString().length() == 2) {
                    response.add(map.get(sj.toString()));
                    sj = new StringJoiner("");
                } else {
                    for (int j = 0; j < sj.toString().length()-2; j++) {
                        response.add(map.get(String.valueOf(sj.toString().charAt(j))));
                    }

                    StringJoiner pr = new StringJoiner("");
                    pr.add(String.valueOf(sj.toString().charAt(sj.toString().length()-2)));
                    pr.add(String.valueOf(sj.toString().charAt(sj.toString().length()-1)));
                    response.add(map.get(pr.toString()));

                    sj = new StringJoiner("");
                }
            }

        }


        if (sj.length()>0) {
            for (int i = 0; i < sj.toString().length(); i++) {
                response.add(map.get(String.valueOf(sj.toString().charAt(i))));
            }
        }

        return response.toString();

    }


}
