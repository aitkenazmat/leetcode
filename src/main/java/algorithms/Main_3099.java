package algorithms;

public class Main_3099 {

    public static void main(String[] args) {
        //sumOfTheDigitsOfHarshadNumber(1);
        System.out.println(sumOfTheDigitsOfHarshadNumber(18));
    }

    public static int sumOfTheDigitsOfHarshadNumber(int x) {

        String s = String.valueOf(x);

        if (s.length()==1) {
            return x;
        }

        if (s.length()==2) {
            char c = s.charAt(0);
            char c1 = s.charAt(1);
            Integer r = Integer.parseInt(String.valueOf(c)) + Integer.parseInt(String.valueOf(c1));
            return x % r == 0 ? r : -1;
        }

        if (s.length()==3) {
            char c = s.charAt(0);
            char c1 = s.charAt(1);
            char c2 = s.charAt(2);
            Integer r = Integer.valueOf(c) + Integer.valueOf(c1)+Integer.valueOf(c2);
            return x % r == 0 ? r : -1;
        }

        return -1;
    }
}
