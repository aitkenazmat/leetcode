package algorithms.string;

public class ReplaceAllDigitswithCharacters {
    public static void main(String[] args) {

        String s = "a1b2c3d4e";

        System.out.println(replaceDigits(s));

    }

    public static String replaceDigits(String s) {

        String[] split = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length ; i+=2) {
            char a = split[i].charAt(0);
            stringBuilder.append(a);
            if (i < split.length-1) {
                int b = Integer.parseInt(split[i + 1]);
                char vv = (char) (a + b);
                stringBuilder.append(vv);
            }
        }

        return stringBuilder.toString();
    }
}
