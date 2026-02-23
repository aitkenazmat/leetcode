package algorithms;

import java.util.Arrays;
import java.util.StringJoiner;

public class Main_1370 {
  public static void main(String[] args) {
    sortString("aaaabbbbcccc");
  }


  public static String sortString(String s) {




    StringJoiner sj  = new StringJoiner("");

    while (sj.length() < s.length()) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);


      char theSmallest = chars[0];
      sj.add(String.valueOf(theSmallest));

      StringBuilder sb = new StringBuilder();
      String recSmallestResult = recSmallest(sb, theSmallest, 1, chars);
      sj.add(recSmallestResult);


      char theLargest = chars[chars.length-1];
      sj.add(String.valueOf(theLargest));

      StringBuilder sb1 = new StringBuilder();
      String recLargestResult = recLargest(sb1, theLargest, chars.length-2, chars);
      sj.add(recLargestResult);

    }



    return sj.toString();

  }




  public static String recSmallest(StringBuilder sb, char  theSmallest, int idx, char[] chars ) {

    for (int i = idx; i < chars.length; i++) {
      if (theSmallest < chars[i]) {
        sb.append(chars[i]);
        return recSmallest(sb,chars[i], i, chars );
      }
    }
    return sb.toString();
  }

  public static String recLargest(StringBuilder sb, char  theLargest, int idx, char[] chars ) {

    for (int i = idx ; i > 0 ; i--) {

      if (theLargest > chars[i]) {
        sb.append(chars[i]);
        return recLargest(sb,chars[i], i, chars );
      }

    }

    return sb.toString();
  }
}
