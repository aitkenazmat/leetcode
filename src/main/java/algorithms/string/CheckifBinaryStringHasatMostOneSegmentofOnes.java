package algorithms.string;

public class CheckifBinaryStringHasatMostOneSegmentofOnes {
    public static void main(String[] args) {

        String s = "1";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        if (s.length() == 1) {
            if (s.equals("1")) {
                return true;
            } else {
                return false;
            }
        } else {
            String[] split = s.split("");
            for (int i = 0; i < split.length ; i++) {
                if (split[i].equals("1")) {
                    if (i < split.length-1) {
                        if (split[i+1].equals("1")) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

    }
}
