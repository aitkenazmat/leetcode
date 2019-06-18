package algorithms.string;


public class Main242 {
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("azat","taza");
        System.out.println(isAnagram);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.equals(t))
            return true;

        boolean isAnagram = false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();


        if (s.length() == t.length()) {
            for (int i = 0; i < tChars.length ; i++) {
                int position = isHasSymbol(sChars, tChars[i]);
                if (position!=-1) {
                    sChars[position] = ' ';
                    isAnagram = true;
                } else {
                    isAnagram = false;
                    break;
                }
            }
        }
        return isAnagram;
    }

    static int  isHasSymbol(char[] symbols, char symbol){
        int position = -1;
        for (int i = 0; i < symbols.length ; i++) {
            if (symbols[i]==symbol) {
                position = i;
                break;
            }
        }
        return position;
    }
}
