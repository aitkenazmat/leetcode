package algorithms.string;

public class MergeStringsAlternately {
    public static void main(String[] args) {


        System.out.println(mergeAlternately("aaa", "zmtik"));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                stringBuilder.append(word1.charAt(i));
                stringBuilder.append(word2.charAt(i));
            }
        } else if (word1.length() > word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                stringBuilder.append(word1.charAt(i));
                stringBuilder.append(word2.charAt(i));
            }
            for (int i = word2.length(); i < word1.length() ; i++) {
                stringBuilder.append(word1.charAt(i));
            }
        } else  {
            for (int i = 0; i < word1.length(); i++) {
                stringBuilder.append(word1.charAt(i));
                stringBuilder.append(word2.charAt(i));
            }
            for (int i = word1.length(); i < word2.length() ; i++) {
                stringBuilder.append(word2.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

}
