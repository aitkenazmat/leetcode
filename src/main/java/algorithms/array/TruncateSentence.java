package algorithms.array;

public class TruncateSentence {

    public static void main(String[] args) {

        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length ; i++) {
            if ( i < k) {
                sb.append(s1[i]).append(" ");
            }
        }

        return sb.toString().trim();
    }
}
