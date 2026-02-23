package algorithms.hashmap;

public class Main_2062 {

  public static void main(String[] args) {

    System.out.println(countVowelSubstrings("aeiouu"));
    System.out.println(countVowelSubstrings("unicornarihan"));
    System.out.println(countVowelSubstrings("cuaieuouac"));
  }

  public static int countVowelSubstrings(String word) {
    int countVowelSubstr = 0;
    for (int k = 6; k < 6  ; k++) {
      for (int i = 0; i <= word.length() - k; i++) {
        String s = word.substring(i, i + k);
        System.out.println(s);
        if (hasAllVowel(s)) {
          countVowelSubstr ++;
        }
      }
    }
    return countVowelSubstr;
  }
  
  public static boolean hasAllVowel(String s) {
    int countVowel = 0;

    boolean aExist = false;
    boolean eExist = false;
    boolean iExist = false;
    boolean oExist = false;
    boolean uExist = false;

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == 'a' && !aExist) {
        aExist = true;
        countVowel++;
      }

      if (s.charAt(i) == 'e' && !eExist) {
        eExist = true;
        countVowel++;
      }
      if (s.charAt(i) == 'i' && !iExist) {
        iExist = true;
        countVowel++;
      }
      if (s.charAt(i) == 'o' && !oExist) {
        oExist = true;
        countVowel++;
      }
      if (s.charAt(i) == 'u' && !uExist) {
        uExist = true;
        countVowel++;
      }
    }

    return countVowel >=5;
  }
}
