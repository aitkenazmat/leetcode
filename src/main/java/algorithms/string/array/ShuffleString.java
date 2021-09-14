package algorithms.string.array;

public class ShuffleString {
    public static void main(String[] args) {

        int[] indexces = new int[]{4,5,6,7,0,2,1,3};
        String codeleet = restoreString("codeleet", indexces);
        System.out.println(codeleet);
    }

    public static String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();



        return sb.toString();
    }
}
