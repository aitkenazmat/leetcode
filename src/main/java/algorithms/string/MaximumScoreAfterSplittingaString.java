package algorithms.string;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MaximumScoreAfterSplittingaString {

    public static void main(String[] args) {

        System.out.println(maxScore("011101"));
    }

    public static int maxScore(String s) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 1; i < s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            int count = count(left, '0');
            int count1 = count(right, '1');
            integers.add(count+count1);

        }
        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        return max.get();
    }

    public static int count(String s, char search){
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == search) {
                count++;
            }
        }
        return count;
    }
}
