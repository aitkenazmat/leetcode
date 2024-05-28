package algorithms.array;

public class Main_121 {
    public static void main(String[] args) {
        int[]arr = {7,1,5,3,6,4};
        maxProfit(arr);
    }

    public static int maxProfit(int[] prices) {


        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i < prices.length-1 && prices[i] > prices[i+1]) {

                System.out.println(prices[i]);
                System.out.println(prices[i+1]);
                System.out.println("----");
//                for (int j = i +1 ; j < prices.length; j++) {
//                    if (j < prices.length-1 && prices[j+1] - prices[i+1] > max) {
//                        max = prices[j+1] - prices[j];
//                    }
//                }
            }
        }

        return max;

    }
}
