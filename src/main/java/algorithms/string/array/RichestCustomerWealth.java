package algorithms.string.array;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] twoDimArray = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(twoDimArray));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0 ; i < accounts.length ; i++) {
            int maxTmp = 0;
            for (int j = 0; j < accounts[i].length ; j++)
                maxTmp+=accounts[i][j];
            if (maxTmp >= max)  max = maxTmp;
        }
        return max;

    }
}
