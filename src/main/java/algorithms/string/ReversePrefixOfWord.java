package algorithms.string;

public class ReversePrefixOfWord {
    public static void main(String[] args) {

        //System.out.println(reversePrefix("abcdefgh", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
    }

    public static String reversePrefix(String word, char ch) {

        char[] chars = word.toCharArray();
        int indexByCh = getIndexByCh(chars, ch);
        if (indexByCh!=-1) {
            char[] newChars = new char[chars.length];

            for (int i = 0; i < chars.length ; i++) {
                if (i<=indexByCh) {
                    newChars[indexByCh-i] = chars[i];
                } else {
                    newChars[i] = chars[i];
                }
            }


            return getResult(newChars);
        } else {
            return word;
        }
    }

    public static int getIndexByCh(char[] chars,char ch){

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }

        return -1;

    }


    public static String getResult(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length ; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
