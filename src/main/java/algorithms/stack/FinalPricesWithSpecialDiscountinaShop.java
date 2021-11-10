package algorithms.stack;


import java.util.Stack;

//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class FinalPricesWithSpecialDiscountinaShop {

    public static void main(String[] args) {
        int[] prices = new int[]{8, 4, 6, 2, 3};
//        int[] prices = new int[]{10, 1, 1, 6};
        finalPrices(prices);
    }

    public static int[] finalPrices(int[] prices) {
        int[]res = new int[prices.length];
        Stack<Integer> stack = new Stack<>();



        for (int i = prices.length-1; i >= 0  ; i--) {
            for (int j = i-1; j >= 0 ; j--) {
                if (prices[j]<=prices[i]) {
                    stack.push(prices[j]);
                    break;
                }
            }

        }

        for (int i = 0; i < prices.length; i++) {
            int product = prices[i];
            if (!stack.empty()) {
                res[i] = product - stack.peek();
                stack.pop();
            } else {
                res[i] = product;
            }
        }

        return null;
    }

//    public static int[] finalPrices(int[] prices) {
//        int[] res = new int[prices.length];
//        for (int i = 0; i < prices.length; i++) {
//            int p = prices[i];
//            int s = p;
//            boolean existS = false;
//            for (int j = i+1; j < prices.length; j++) {
//                if (p >= prices[j]) {
//                    existS = true;
//                    s = prices[j];
//                    break;
//                }
//            }
//
//            if (existS && s <= p) {
//                res[i] = p - s;
//            } else {
//                res[i] = p;
//            }
//        }
//        return res;
//    }
}
