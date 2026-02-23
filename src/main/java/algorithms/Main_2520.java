package algorithms;

public class Main_2520 {

    public static void main(String[] args) {

    }


    public int countDigits(int num) {
        int count = 0;
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int val = Integer.valueOf(String.valueOf(s.charAt(i)));
            if (num % val == 0) {
                count++;
            }
         }
        return count;
    }
}
