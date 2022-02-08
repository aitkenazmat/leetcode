package algorithms.string;

import java.util.StringJoiner;

public class GoatLatin {
    public static void main(String[] args) {
        toGoatLatin("I speak Goat Latin");
    }

    public static String toGoatLatin(String sentence) {
        String[] split = sentence.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < split.length; i++) {
            stringJoiner.add(regen(split[i], i));
        }
        return stringJoiner.toString();
    }


    public static String regen(String word, int index) {
        String first = String.valueOf(word.charAt(0));
        StringJoiner stringJoiner = new StringJoiner("");
        if (first.equals("a") ||first.equals("e") || first.equals("i") ||
            first.equals("o") || first.equals("u") || first.equals("A") ||first.equals("E") || first.equals("I") ||
                first.equals("O") || first.equals("U")) {
            stringJoiner.add(word);
            stringJoiner.add("ma");
            word = stringJoiner.toString();
        } else {
            stringJoiner.add(word.substring(1));
            stringJoiner.add(first);
            stringJoiner.add("ma");
            word = stringJoiner.toString();
        }

        for (int i = 0; i < index+1; i++) {
            stringJoiner.add("a");
        }

        word = stringJoiner.toString();



        return word;
    }
}
