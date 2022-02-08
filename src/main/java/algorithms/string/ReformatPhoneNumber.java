package algorithms.string;

public class ReformatPhoneNumber {
    public static void main(String[] args) {


        System.out.println(reformatNumber("9964-"));

    }

    public static String reformatNumber(String number) {
        String s = number.replaceAll("\\s+","")
                .replaceAll("-","");

        if (s.length()>2) {
            StringBuilder stringBuilder = new StringBuilder();
            if (s.length() % 3 == 0) {
                handlerMainBlock(stringBuilder,s.length()/3, s);
                return stringBuilder.toString();
            } else if (s.length() % 3 == 2) {
                handlerMainBlock(stringBuilder, s.length() / 3, s);
                String substring = s.substring(s.length() - 2);
                stringBuilder.append("-").append(substring);
                return stringBuilder.toString();
            } else {

                handlerMainBlock(stringBuilder, (s.length()-4)/3, s);


                String substring = s.substring(s.length() - 4);
                String substring1 = substring.substring(0,substring.length()/2);
                String substring2 = substring.substring(substring.length() / 2);

                if (stringBuilder.length() > 0) {
                    stringBuilder.append("-").append(substring1).append("-").append(substring2);
                } else {
                    stringBuilder.append(substring1).append("-").append(substring2);
                }

                return stringBuilder.toString();
            }
        } else {
            return s;
        }

    }

    public static void handlerMainBlock(StringBuilder stringBuilder, int length, String s){
        int start = 0;
        int finish = 2;

        for (int i = 0; i < length; i++) {
            String substring = s.substring(start, finish+1);
            stringBuilder.append(substring);
            if (i < length -1) {
                stringBuilder.append("-");
            }
            start = finish +1;
            finish = finish+3;
        }
    }
}
