package algorithms.string;

public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }


    public static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuilder sourceStr = new StringBuilder();
        for (int i = 0; i < s1.length() ; i++) {
            if (s1.charAt(i) >=48 &&  s1.charAt(i) <= 57) {
                sourceStr.append(s1.charAt(i));
            }

            if (s1.charAt(i) >=97 &&  s1.charAt(i) <= 122) {
                sourceStr.append(s1.charAt(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = sourceStr.length()-1; i >=0 ; i--) {
            stringBuilder.append(sourceStr.charAt(i));
        }

        return sourceStr.toString().equals(stringBuilder.toString());
    }
}
