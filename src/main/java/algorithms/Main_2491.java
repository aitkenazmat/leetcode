package algorithms;

import java.util.Arrays;

public class Main_2491 {
    public static void main(String[] args) {
        int[] skill = new int[]{3,2,5,1,3,4};
        dividePlayers(skill);
    }

    public static long dividePlayers(int[] skill) {

        Arrays.sort(skill);

        int i = 0;
        int j = skill.length -1;

        int sum = skill[i] + skill[j];
        long res = 0;

        while (i < j) {
            if (sum != skill[i] + skill[j]) {
                return -1;
            }
            res+= (long) skill[i] * skill[j];

            i++;
            j--;
        }

        return res;
    }
}
