package algorithms;

public class Main_2716 {
    public static void main(String[] args) {

        minimizedStringLength("123456789");
    }


    public static int minimizedStringLength(String s) {

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(i+1));
            System.out.println(s.charAt(i+2));

            System.out.println("---");
        }

        return 0;
    }
}
