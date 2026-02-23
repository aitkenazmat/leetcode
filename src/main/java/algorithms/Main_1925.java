package algorithms;

public class Main_1925 {
    public static void main(String[] args) {
        System.out.println(countTriples(5));
        System.out.println(countTriples(10));
        System.out.println(countTriples(228));
    }

    public static int countTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    if (i != j && i!=k && j!=k) {
                        double a = Math.pow(i, 2);
                        double b = Math.pow(j, 2);
                        double c = Math.pow(k, 2);
                        if (a + b == c) {
                            count++;
                            break;
                        }
                    }
                }
            }
        }

        return count;
    }
}
