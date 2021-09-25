package algorithms.string;

public class BuddyStrings {
    public static void main(String[] args) {

        String s = "aaaaaaaba";
        String goal = "aaaaaaaab";

        System.out.println(buddyStrings(s, goal));

    }



    public static boolean buddyStrings(String s, String goal) {

        char[] goalChars = goal.toCharArray();

        for (int i = 0; i < s.length() ; i++) {
            char sChar = s.charAt(i);
            char gChar = goalChars[i];

            if ( sChar!= gChar) {
                System.out.println("index: " + i );
                System.out.println("sChar: " + sChar );
                System.out.println("gChar: " + gChar );
                break;
            }
        }

        return false;
    }

    public static String charsToStr(char[]chars){
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i <chars.length ; i++) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }
}
