package algorithms.string;

public class SplitStringBalancedStrings {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int rCounter = 0;
        int lCounter = 0;
        int totalCounter = 0;
        for (int i = 0; i <  s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rCounter++;
            } else {
                lCounter++;
            }
            if (rCounter==lCounter) {
                totalCounter++;
            }
        }

        return totalCounter;
    }
}
