package algorithms;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main12 {
    public static void main(String[] args) {


     String s = "1968-06-25T00:00:00.000+00:00";



        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'00:00:00.000+00:00");
        LocalDate datetime = LocalDate.parse(s, pattern);
        System.out.println(datetime);


    }

    public static String intToRoman(int num) {
        StringBuilder result = new  StringBuilder();
        int m = num / 1000;
        if ( m > 0 ) {
            num = num - generateM(m);
            result.append(generateMRoman(m));
        }

        int c = num / 100;
        if (c > 0) {
            num = num - generateC(c);
            result.append(generateCRoman(c));
        }

        int x = num / 10;
        if (x > 0 ) {
            num = num - generateX(x);
            result.append(generateXRoman(x));
        }

        int i = num / 1;
        if (i > 0 ) {
            result.append(generateIRoman(num));
        }

        return result.toString();
    }

    public static int generateM(int m) {
        if (m==1){
            return 1000;
        } else if (m==2) {
            return 2000;
        } else if (m==3) {
            return 3000;
        }
        return 4000;
    }

    public static String generateMRoman(int m) {
        if (m==1){
            return "M";
        } else if (m==2) {
            return "MM";
        } else if (m==3) {
            return "MMM";
        }
        return "MMMM";
    }

    public static int generateC(int c) {
        if (c==1){
            return 100;
        } else if (c==2) {
            return 200;
        } else if (c==3) {
            return 300;
        }else if (c==4) {
            return 400;
        }else if (c==5) {
            return 500;
        }else if (c==6) {
            return 600;
        }else if (c==7) {
            return 700;
        }else if (c==8) {
            return 800;
        }else if (c==9) {
            return 900;
        }
        return 1000;
    }

    public static String generateCRoman(int c) {
        if (c==1){
            return "C";
        } else if (c==2) {
            return "CC";
        } else if (c==3) {
            return "CCC";
        }else if (c==4) {
            return "CD";
        }else if (c==5) {
            return "D";
        }else if (c==6) {
            return "DC";
        }else if (c==7) {
            return "DCC";
        }else if (c==8) {
            return "DCCC";
        }else if (c==9) {
            return "CM";
        }
        return "M";
    }

    public static int generateX(int x) {
        if (x==1){
            return 10;
        } else if (x==2) {
            return 20;
        } else if (x==3) {
            return 30;
        }else if (x==4) {
            return 40;
        }else if (x==5) {
            return 50;
        }else if (x==6) {
            return 60;
        }else if (x==7) {
            return 70;
        }else if (x==8) {
            return 80;
        }else if (x==9) {
            return 90;
        }
        return 100;
    }
    public static String generateXRoman(int x) {
        if (x==1){
            return "X";
        } else if (x==2) {
            return "XX";
        } else if (x==3) {
            return "XXX";
        }else if (x==4) {
            return "XL";
        }else if (x==5) {
            return "L";
        }else if (x==6) {
            return "LX";
        }else if (x==7) {
            return "LXX";
        }else if (x==8) {
            return "LXXX";
        }else if (x==9) {
            return "XC";
        }
        return "C";
    }

    public static String generateIRoman(int i) {
        if (i==1){
            return "I";
        } else if (i==2) {
            return "II";
        } else if (i==3) {
            return "III";
        }else if (i==4) {
            return "IV";
        }else if (i==5) {
            return "V";
        }else if (i==6) {
            return "VI";
        }else if (i==7) {
            return "VII";
        }else if (i==8) {
            return "VIII";
        }else if (i==9) {
            return "IX";
        }
        return "X";
    }

}
