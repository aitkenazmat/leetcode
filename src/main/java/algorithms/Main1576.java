package algorithms;

import java.util.Random;

public class Main1576 {
    public static void main(String[] args) {
        System.out.println(modifyString("??"));
    }

    public static String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] == '?') {
                int nextIndex = 0;
                int previewIndex = 0;
                if (i == 0) {
                    nextIndex = s.length()!= 1 ?  chars[i] + 1 : 0;
                } else if (chars[i] == chars.length - 1) {
                    previewIndex = chars[i] - 1;
                } else {
                    nextIndex = chars[i] + 1;
                    previewIndex = chars[i] - 1;
                }

                char[] swap = swap(chars, i, nextIndex, previewIndex);
                return modifyString(String.valueOf(swap));
            }
        }

        return s;
    }

    public static char[] swap(char[]chars, int indexSwap, int nextIndex, int previewIndex ){
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a');

        if (previewIndex == 0 && nextIndex!=0) {
            if (randomChar == nextIndex) {
                swap(chars, indexSwap, nextIndex, previewIndex);
            }
        } else if (previewIndex!=0 && nextIndex == 0) {
            if (randomChar == previewIndex) {
                swap(chars, indexSwap, nextIndex, previewIndex);
            }
        } else {
            if (randomChar == previewIndex && randomChar == nextIndex) {
                swap(chars, indexSwap, nextIndex, previewIndex);
            }
        }

        chars[indexSwap] = randomChar;

        return chars;
    }
}
