package algorithms.string.array;

public class CheckIfStringIsPrefixArray {
    public static void main(String[] args) {

        String s = "i";
        String[] words = new String[]{"i"};
        System.out.println(isPrefixString(s, words));
    }

    public static boolean isPrefixString(String s, String[] words) {
        return  eq(s, words,0, new StringBuilder());
    }

    public static boolean eq(String s, String[] words, int index, StringBuilder word){
        if (index >= words.length) { return false; }
        word.append(words[index]) ;
        if (word.toString().equals(s)) {
            return  true;
        } else {
            index++;
            return eq(s,words,index,word);
        }
    }
}
