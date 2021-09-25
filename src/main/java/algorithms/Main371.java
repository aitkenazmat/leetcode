package algorithms;

import java.util.stream.IntStream;

/**
 * Created by WWW on 23.03.2019.
 */
public class Main371 {
    public static void main(String[] args) {
        System.out.println(getSum(5, 3));
    }

    public static int getSum(int a, int b) {
        int ints[]={a,b};
        return IntStream.of(ints).sum();
    }
}
