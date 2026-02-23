package algorithms.backtracking;

public class Backtracking {

  static int count = 1;

  public static void main(String[] args) {

    String s = "abc";
    rec(s, new boolean[s.length()],"");
  }


  public static void rec(String s, boolean[]visited, String curr) {

    if (s.length() == curr.length()) {
      System.out.println(count +" "+curr);
      count++;
      return;
    }

    for (int i = 0; i < s.length(); i++) {
      if (!visited[i]) {
        visited[i] = true;
        rec(s, visited, curr + s.charAt(i));
        visited[i] = false;
      }
    }
  }
}
