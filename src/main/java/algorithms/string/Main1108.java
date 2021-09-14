package algorithms.string;

public class Main1108 {
    public static void main(String[] args) {

        String s = defangIPaddr("192.168.0.2");
        System.out.println(s);

    }


    public static String defangIPaddr(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] split = address.split("\\.");


        for (int i = 0; i <split.length ; i++) {
            stringBuilder.append(split[i]);

            if (i< split.length-1) {
                stringBuilder.append("[.]");
            }
        }


        return stringBuilder.toString();
    }
}
