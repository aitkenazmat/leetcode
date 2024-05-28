package algorithms.array;

import java.util.List;

public class Main_2859 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 10, 1, 5, 2);
        System.out.println(sumIndicesWithKSetBits(integers, 1));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int total = 0;

        for (int i = 0; i < nums.size(); i++) {
            String binaryString = Integer.toBinaryString(i);
            char[] charArray = binaryString.toCharArray();

            int count = 0;
            for (char c : charArray) {
                if (c == '1') {
                    count++;
                }
            }

            if (count == k) {
                total+=nums.get(i);
            }
        }

        return total;
    }
}
