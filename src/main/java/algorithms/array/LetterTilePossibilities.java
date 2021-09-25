package algorithms.array;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        numTilePossibilities("AB");
    }

    public static int numTilePossibilities(String tiles) {

        for (int i = 0; i < tiles.length(); i++) {
            System.out.println("r:" + tiles.charAt(i));
            for (int j = 0; j < tiles.length() ; j++) {
                System.out.print(tiles.charAt(j));
            }

            System.out.println("******");

            for (int j = tiles.length()-1; j > 0 ; j--) {
                System.out.print(tiles.charAt(j));
            }

            System.out.println("-------------");
        }

        return 0;

    }
}
