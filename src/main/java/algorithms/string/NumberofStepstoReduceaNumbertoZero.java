package algorithms.string;

public class NumberofStepstoReduceaNumbertoZero {

    static int countStep = 0;

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }

    public static int numberOfSteps(int num) {
        int countStep = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                countStep++;
                num = num / 2;
            } else {
                num = num - 1;
                countStep++;
            }
        }
        return countStep;
    }



}
