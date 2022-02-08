package algorithms.dynamic_programming;

public class CountingBits {

    public static void main(String[] args) {

        int[] ints = countBits(5);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] countBits(int n) {

        int[] arr = new int[n+1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                arr[0] = 0;
            } else if (i == 1) {
                arr[1] = 1;
            } else {
                String binaryString = Integer.toBinaryString(i);
                arr[i] = getCount(binaryString);
            }
        }

        return arr;
    }

    public static int getCount(String s) {
       int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
