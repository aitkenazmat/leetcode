package algorithms.string;

public class Main415 {

    public static void main(String[] args) {

        int carry = 0;
        String a = "45";
        String b = "55";
        int n1 = a.charAt(0) - '0';
        int n2 = b.charAt(0) - '0';

        int n3 = a.charAt(1) - '0';
        int n4 = b.charAt(1) - '0';



        int sum = n1+n2+carry;

        carry = sum / 10;


        System.out.println( sum%10 );


    }

    public String addStrings(String num1, String num2) {
        String[] digits1 = num1.split("");
        String[] digits2 = num2.split("");


        //num1.toBinaryString();



        return null;
    }

    //public static void
}
