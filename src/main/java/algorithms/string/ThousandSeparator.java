package algorithms.string;

public class ThousandSeparator {
    public static void main(String[] args) {

//        int n = 12_345_678;
//        int n = 100_000;
//        int n = 123456;
        int n = 12_456;
//        int n = 12_456_789;
//        int n = 1_234;
        System.out.println(thousandSeparator(n));
    }

    public  static String thousandSeparator(int n) {

        StringBuilder stringBuilder = new StringBuilder();
        String s = String.valueOf(n);
        if (s.length() <=3) {
            return s;
        } else {
            if (s.length() % 3 == 0) {
                int countDot = s.length()/3-1;
                int countDotFact = 0;

                for (int i = 0; i < s.length(); i+=3) {
                    stringBuilder.append(s.charAt(i));
                    stringBuilder.append(s.charAt(i+1));
                    stringBuilder.append(s.charAt(i+2));
                    if (countDotFact < countDot) {
                        stringBuilder.append(".");
                        countDotFact++;
                    }
                }
                return stringBuilder.toString();

            } else {
                int countDot = s.length()/3;
                int countDotFact = 0;


                String substring = s.substring(0, s.length() - (countDot * 3));
                stringBuilder.append(substring).append(".");
                countDotFact++;


                for (int i = s.length() - (countDot * 3); i < s.length() ; i+=3) {
                    stringBuilder.append(s.charAt(i)).append(s.charAt(i+1)).append(s.charAt(i+2));
                    if (countDotFact < countDot) {
                        stringBuilder.append(".");
                        countDotFact++;
                    }
                }

                return stringBuilder.toString();

            }
        }

    }
}
