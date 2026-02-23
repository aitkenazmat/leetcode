package algorithms;

import java.math.BigInteger;

public class Main_43 {
    public static void main(String[] args) {

    }

    public String multiply(String num1, String num2) {

        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);
        BigInteger b3 = b1.multiply(b2);

        return b3.toString();

    }
}
