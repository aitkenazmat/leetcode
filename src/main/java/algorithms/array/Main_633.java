package algorithms.array;

public class Main_633 {

    public static void main(String[] args) {

        System.out.println(judgeSquareSum(4));
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));

    }

    public static boolean judgeSquareSum(int c) {

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i > c) {
                return false;
            }

            int p1 = (int) Math.pow(i, 2);
            if (p1 + p1 == c) {
                return true;
            }

            for (int j = i+1; j < Integer.MAX_VALUE; j++) {
                if (j > c) {
                    break;
                }
                int p2 = (int) Math.pow(j, 2);
                if (p2 + p1 == c) {
                    return true;
                }
            }


        }
        return false;
    }
}
