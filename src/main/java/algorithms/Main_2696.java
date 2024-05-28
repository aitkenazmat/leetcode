package algorithms;

public class Main_2696 {


    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }

    public static int minLength(String s) {

        String s1 = minLength2(s);


        return s1.length();

    }

    public static String minLength2(String s) {

        StringBuilder ns = new StringBuilder(s);
        for (int i = 0; i < ns.length() - 1; i++) {
            String s1 = String.valueOf(s.charAt(i));
            String s2 = String.valueOf(s.charAt(i + 1));

            if ("AB".equalsIgnoreCase(s1+s2) || "CD".equalsIgnoreCase(s1+s2)) {
                ns.deleteCharAt(i);
                ns.deleteCharAt(i);
                return minLength2(ns.toString());
            }
        }

        return ns.toString();
    }
}
