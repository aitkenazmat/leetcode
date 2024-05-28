package algorithms;

public class Main_1071 {
    public static void main(String[] args) {
        gcdOfStrings("ABCABCABC","ABC");
    }


    public static String gcdOfStrings(String str1, String str2) {

        int k = str2.length();
        for (int i = 0; i < str1.length()/ k ; i++) {
            System.out.println(i + k);
        }

        return null;
    }
}
