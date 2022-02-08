package algorithms.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = new int[]{73,74,75,71,69,72,76,73};
        dailyTemperatures(temperatures);
    }

    public static int[] dailyTemperatures(int[] temperatures) {

        int[]answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i+1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    answer[i] = j-i;
                    break;
                }
            }
        }
        return answer;
    }
}
