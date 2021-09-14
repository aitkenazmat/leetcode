package algorithms.string;

public class AddBinary {
    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {

        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        int number2 = number0+number1;
        return Integer.toBinaryString(number2);

    }
}
