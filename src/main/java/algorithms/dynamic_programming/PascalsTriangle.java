package algorithms.dynamic_programming;

import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {


                if (j % 2 == 0) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            }
            System.out.println("-----");
        }


        return null;
    }
}
