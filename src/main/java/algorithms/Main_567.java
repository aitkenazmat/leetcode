package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_567 {

    public static void main(String[] args) {

        System.out.println(checkInclusion("prosperity", "properties"));

    }

    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        List<String> variants = new ArrayList<>();
        rec(s1, new boolean[s1.length()],"",variants);


        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            String s3 = s2.substring(i, i + s1.length());
            if (variants.contains(s3)) {
                return true;
            }
        }

        return false;
    }


    public static void rec(String s, boolean[]visited, String curr, List<String> var) {

        if (s.length() == curr.length()) {
            var.add(curr);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                rec(s, visited, curr + s.charAt(i), var);
                visited[i] = false;
            }
        }
    }
}
