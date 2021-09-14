package algorithms.string;

public class AddStrings {

    public static void main(String[] args) {
        System.out.println(addStrings("1", "9"));
    }

    public static String addStrings(String num1, String num2) {
        String[] splitNum1 = num1.split("");
        String[] splitNum2 = num2.split("");


        int difference = 0;
        if (splitNum1.length == splitNum2.length || splitNum1.length > splitNum2.length) {
            difference = splitNum1.length- splitNum2.length;
            return addStrings(splitNum1, splitNum2, difference);
        } else {
            difference = splitNum2.length- splitNum1.length;
            return addStrings(splitNum2,splitNum1, difference);
        }

    }

    public static String addStrings(String[] splitNum1,String[] splitNum2, int difference){
        StringBuilder stringBuilder = new StringBuilder();
        int memory = 0;
        for (int i = splitNum1.length-1; i >=  0; i--) {
            Integer s1 = Integer.valueOf(splitNum1[i]);
            Integer s2 =0;
            if (i>= difference) {
                s2 = Integer.valueOf(splitNum2[i-difference]);
            }
            int res = s1 +  s2;
            if (res >= 10) {
                stringBuilder.append((res-10) + memory );
                memory = 1;
            } else  {

                int r = res + memory;

                if (r >= 10) {
                    stringBuilder.append(0);
                    memory = 1;
                } else  {
                    stringBuilder.append(res + memory);
                    memory = 0;
                }



            }
        }

        if (memory!=0) {
            stringBuilder.append("1");
        }

        return stringBuilder.reverse().toString();
    }
}
