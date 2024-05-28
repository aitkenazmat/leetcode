package algorithms;

public class Main_2706 {

    public static void main(String[] args) {

        int[] arr = new int[]{98,54,6,34,66,63,52,39};

        System.out.println(buyChoco(arr, 62));
    }


    public static int buyChoco(int[] prices, int money) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int f = prices[i];

            if (i <= prices.length -1) {
                for (int j = i+1; j < prices.length; j++) {
                    int s = prices[j];
                    int r = money - (f + s)  ;

                    if (r >=0) {
                        if (r > max) {
                            max = r;
                        }
                    }

                }
            }

        }

        return max != Integer.MIN_VALUE ? max : money;
    }
}
