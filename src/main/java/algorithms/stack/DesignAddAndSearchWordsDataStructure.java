package algorithms.stack;

public class DesignAddAndSearchWordsDataStructure {

    public static void main(String[] args) {

        WordDictionary w = new WordDictionary();

        w.addWord("a");
        w.addWord("ab");
        System.out.println(w.search("a"));
        System.out.println(w.search("a."));
        System.out.println(w.search("ab"));
        System.out.println(w.search(".a"));
        System.out.println(w.search(".b"));
        System.out.println(w.search("."));
        System.out.println(w.search(".."));
    }


}
