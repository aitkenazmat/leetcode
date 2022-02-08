package algorithms.recursion;

public class PowerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
//        System.out.println(isPowerOfTwo(3, 2));
//        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        return isPowerOfTwo(n,0);
    }

    public static boolean isPowerOfTwo(int n, int x) {
        double pow = Math.pow(2, x);
        if (pow == n) {
            return true;
        } else if (pow > n) {
            return false;
        } else {
            x++;
            return isPowerOfTwo(n,x);
        }
    }

}
