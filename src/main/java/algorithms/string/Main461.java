package algorithms.string;

/**
 *
 * 461. Hamming Distance
 *
 * */

public class Main461 {

    public static void main(String[] args) {
        hammingDistance(1, 4);
    }

    public static int hammingDistance(int x, int y) {

        int c = x ^ y;
        int setBits = 0;

        while (c > 0)
        {
            setBits += c & 1;
            c >>= 1;
        }

        return setBits;
    }
}
