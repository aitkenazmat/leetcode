package algorithms.array;

import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {

    public static void main(String[] args) {

//        int[]arr = new int[]{4000,3000,1000};
//        int[]arr = new int[]{1000,2000,3000};
//        int[]arr = new int[]{6000,5000,4000,3000,2000,1000};
        int[]arr = new int[]{8000,9000,2000,3000,6000,1000};
        System.out.println(average(arr));
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);

        double total = 0;
        for (int i = 1; i < salary.length-1 ; i++) {
            total+=salary[i];
        }

        return total / (salary.length-2);
    }
}
