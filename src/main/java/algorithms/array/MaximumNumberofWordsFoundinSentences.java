package algorithms.array;

public class MaximumNumberofWordsFoundinSentences {

    public static void main(String[] args) {

        String[]words = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(words));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;
        for (int i = 1; i < sentences.length; i++) {
            int candidate =  sentences[i].split(" ").length;
            if (candidate > max) {
                max = candidate;
            }
        }
        return max;
    }
}
