package algorithms.array;

public class MaximumProductOfWordLengths {
    public static void main(String[] args) {
        String[]words = new String[]{"abcw","baz","foo","bar","atfn","abcdef"};

        System.out.println(maxProduct(words));
    }

    public static int maxProduct(String[] words) {

        for (int i = 0; i < words.length ; i++) {
            int index = getIndex(words, i);
            if (index!=-1) {
                return words[i].length() * words[index].length();
            }
        }
        return 0;
    }


    public static int getIndex(String[]words, int index) {

        String wordCompare = words[index];
        char[] charsCompare = wordCompare.toCharArray();

        for (int i = 0; i < words.length ; i++) {
            if (i!=index) {
                String word  = words[i];
                if (word.length() == wordCompare.length()) {
                    char[] chars = word.toCharArray();

                    for (int j = 0; j < charsCompare.length; j++) outterLoop:  {
                        for (int k = 0; k < chars.length ; k++) {
                            if (charsCompare[j] == chars[k]) {
                                i = -1;
                                break outterLoop;
                            }
                        }
                    }
                    return i;
                }
            }
        }

        return -1;
    }
}
