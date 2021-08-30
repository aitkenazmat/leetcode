package algorithms.string;

import java.io.IOException;
import java.util.*;
import java.util.List;

public class Main3 {
    public static void main(String[] args) throws IOException {
//        int i = lengthOfLongestSubstring("azamat_aitken_omarovich");
//        int i = lengthOfLongestSubstring("abcabcbb");
//        int i = lengthOfLongestSubstring("aab");
        int i = lengthOfLongestSubstring("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        System.out.println("result = " + i);
    }

    public static int lengthOfLongestSubstring(String s) {

        if (!s.equals("")) {
            Set<Integer> strings = new HashSet<>();
            handler(s,strings );

            if (strings.size()>0) {
                return Collections.max(strings);
            } else {
                return s.length();
            }

        }

        return 0;
    }

    public static void handler(String s, Set<Integer> strings){
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length ; i++) {
            sb.append(chars[i]);
            if (sb.length() < s.length()) {
                int position = sb.toString().indexOf(chars[i+1]);
                if ( position != -1) {
                    String result = s.substring(0, i+1);
                    String substring = s.substring(position + 1);

                    strings.add(result.length());
                    handler(substring,strings);
                    break;
                } else {
                    if (sb.length() == s.length()-1) {
                        sb.append(s.charAt(s.length()-1));
                        strings.add(sb.length());
                    } else {
                        continue;
                    }
                }
            }
        }
    }

//    static boolean uniqueCharacters(String str)
//    {
//        for (int i = 0; i < str.length(); i++)
//            for (int j = i + 1; j < str.length(); j++)
//                if (str.charAt(i) == str.charAt(j))
//                    return false;
//        return true;
//    }


    static  void doSomething(char comparableChar, int start, char[] chars, List<String> resultSize) {

        System.out.println("doSomething");

        List<Character> candidate = new LinkedList<>();
        candidate.add(comparableChar);
        for (int i = start; i < chars.length ; i++) {
            if (comparableChar != chars[i]) {
                candidate.add(chars[i]);
                comparableChar = chars[i];
            } else {
                StringBuilder builder = new StringBuilder();
                for (char c : candidate){
                    builder.append(c);
                }
                resultSize.add(builder.toString());
                start = i+1;
                comparableChar = chars[i];
                doSomething(comparableChar, start,chars, resultSize);
            }
        }

        String va = "";

     //  resultSize.add(candidate.size());
    }
}
