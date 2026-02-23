package algorithms;

public class Main_1486 {
    public static void main(String[] args) {
        xorOperation(5, 0);
    }

    public static int xorOperation(int n, int start) {
        int r=0 ;
        for (int i = 0; i < n; i++) {
            r^=start + 2 * i;
        }
        return r;
    }
}
