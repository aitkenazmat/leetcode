package algorithms.array;

public class Main_2652 {
    public static void main(String[] args) {

    }


    public static int sumOfMultiples(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if ( i % 3 == 0 ){
                sum+=i;
                continue;
            }

            if ( i % 5 == 0 ){
                sum+=i;
                continue;
            }

            if ( i % 7 == 0 ){
                sum+=i;
            }
        }
        return sum;
    }
}
