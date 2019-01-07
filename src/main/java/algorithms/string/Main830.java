package algorithms.string;


import java.util.List;

/**
 * 830. Positions of Large Groups
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 *
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 *
 * Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
 *
 * The final answer should be in lexicographic order.
 *
 * */
public class Main830 {

    public static void main(String[] args) {
        largeGroupPositions("abcdddeeeeaabbbcd");
    }


    public static List<List<Integer>> largeGroupPositions(String S) {
        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length ; i++) {

            System.out.println(chars[i]);
           // System.out.println(getCount(chars[i], chars));
        }

        return null;
    }

    public static int getCount(char c, char[]chars){

        int count = 0;
        for (int i =0; i<chars.length; i++) {
            if (c==chars[i]){
                count++;
            } else {
                if (count>3) {
                    count = 0;
                    break;
                }

            }
        }
        return count;
    }


}
