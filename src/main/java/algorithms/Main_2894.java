package algorithms;

public class Main_2894 {

    public static void main(String[] args) {

        System.out.println(differenceOfSums(10, 3));
    }

    public static int differenceOfSums(int n, int m) {

        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2+=i;
            } else {
                num1+=i;
            }
        }

        return num1 - num2;
    }
}
