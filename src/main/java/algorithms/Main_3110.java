package algorithms;

public class Main_3110 {

    public static void main(String[] args) {
        int zaz = scoreOfString("zaz");
        int hello = scoreOfString("hello");
        System.out.println("");
    }

    public static int scoreOfString(String s) {

        int sum = 0;
        char prev = '0';

        for(char c : s.toCharArray()) {
            if(prev != '0') {
                sum += Math.abs(prev - c);

            }
            prev = c;
        }

        return sum;
    }
}
