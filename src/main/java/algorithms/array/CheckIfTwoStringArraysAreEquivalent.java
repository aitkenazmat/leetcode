package algorithms.array;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {


        String[]str1 = new String[]{"a","za","mat"};
        String[]str2 = new String[]{"az","ama","t"};
        arrayStringsAreEqual(str1,str2);

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String w1 =getStrArr(word1);
        String w2 = getStrArr(word2);
        if (w1.length()!=w2.length()) {
            return false;
        } else {
            if (w1.equals(w2)) {
                return  true;
            } else {
                return  false;
            }
        }
    }


    public  static  String getStrArr(String[] word1){
        StringBuilder s = new StringBuilder();
        for ( String w :  word1) {
            s.append(w);
        }

        return  s.toString();
    }
}
