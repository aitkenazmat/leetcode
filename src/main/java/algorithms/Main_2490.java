package algorithms;

public class Main_2490 {

    public static void main(String[] args) {
        String sentence = "IuTiUtGGsNydmacGduehPPGksKQyT TmOraUbCcQdnZUCpGCYtGp p pG GCcRvZDRawqGKOiBSLwjIDOjdhnHiisfddYoeHqxOqkUvOEyI";
        isCircularSentence(sentence);
    }

    public static boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");

        if (arr.length == 1) {
            String s = arr[0];
            char c = s.charAt(0);
            char c1 = s.charAt(s.length() - 1);

            if (c != c1) {
                return false;
            }
            return true;
        }

        if (firstPredicate(arr) && secondPredicate(arr)) {
            return true;
        }
        return false;
    }



    public static boolean firstPredicate(String[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            if (i < arr.length-1) {
                String str1 = arr[i];
                String str2 = arr[i + 1];

                char c = str1.charAt(str1.length() - 1);
                char c1 = str2.charAt(0);

                if (c != c1) {
                    return false;
                }
            }

        }

        return true;
    }

    public static boolean secondPredicate(String[] arr) {
        char c1 = arr[0].charAt(0);

        String lastWord = arr[arr.length-1];
        char c2 = lastWord.charAt(lastWord.length() - 1);
        if (c2 != c1) {
            return false;
        }

        return true;
    }


}
