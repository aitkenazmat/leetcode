package algorithms.string;

public class Main14 {
    public static void main(String[] args) {
        String[] arr = new String[]{"aza_qrwe","aza_", "aza_erwywu"};
        String s = longestCommonPrefix(arr);
        System.out.println(s);

    }


    public static String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for (int i = 0; i < strs[0].length() ; i++)  {
            try {
                char c = str.charAt(i);
                for (int j = 1; j < strs.length ; j++) {
                    if (!(strs[j].charAt(i) == c)) {
                        return str.substring(0, i);
                    }
                }
            } catch (Exception e) {
                return str.substring(0, i);
            }
        }

        return str;
    }
}
