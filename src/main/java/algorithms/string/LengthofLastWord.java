package algorithms.string;

public class LengthofLastWord {
    public static void main(String[] args) {
        lengthOfLastWord(" aza   mat                 aytken   ");
    }

    public  static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        String res = s1[s1.length-1];
        return res.length();
    }
}
