package algorithms;

/**
 *
 * 771. Jewels and Stones
 *
 *
 *
 * */

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;

        for ( int i =0; i< S.length();i++) {
            String stone = String.valueOf(S.charAt(i)) ;
            if (J.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}
