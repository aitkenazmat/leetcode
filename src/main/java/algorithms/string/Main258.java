package algorithms.string;

public class Main258 {


    public static void main(String[] args) {
        int res = addDigits(851);

        System.out.println(res);
    }
    public static int addDigits(int num) {
        Integer n = num;
        String numStr = n.toString();
        char[] numChars = numStr.toCharArray();

        int res=0;
        if (numChars.length>1) {
            int number=0;
            for (int i = 0; i < numChars.length; i++) {
                number+= Character.getNumericValue(numChars[i]) ;
            }
            res = number;
            return addDigits(res);
        } else {
            res =  Character.getNumericValue(numChars[0]) ;
            return res;
        }
    }
}
