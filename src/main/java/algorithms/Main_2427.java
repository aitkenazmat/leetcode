package algorithms;

public class Main_2427 {
    public static void main(String[] args) {

        int[]nums = new int[]{0,1,1,2,3,4,5};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i+1]) {
                for (int j = 0; j < 10; j++) {
                    
                }
            }
        }
        
    }


    public int commonFactors(int a, int b) {
        int x = Math.min(a, b);

        int count = 0;

        for (int i = 1; i <=x ; i++) {
            if (a % i == 0 && b % i ==0) {
                count++;
            }
        }
        return count;
    }
    
    
}
