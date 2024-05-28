package algorithms.array;

public class Main_2544 {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));
    }

    public static int alternateDigitSum(int n) {
        Integer integer = Integer.valueOf(n);
        String string = integer.toString();
        boolean positive = true;
        int sum = 0;
        for (int i = 0; i < string.length(); i++ ) {

            if (positive) {
                sum+=string.charAt(i) - '0';
            } else {
                sum-=string.charAt(i) - '0';
            }

            positive = !positive;

        }



        return sum;

    }
}
