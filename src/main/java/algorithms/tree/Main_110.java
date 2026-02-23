package algorithms.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main_110 {
  public static void main(String[] args) {

    TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    isBalanced(root);
  }


  public static boolean isBalanced(TreeNode root) {

    int left = getHeight(root.left);
    int right = getHeight(root.right);

    if (Math.abs(left - right) > 1) {
      return false;
    } else {
      return isBalanced(root.left) && isBalanced(root.right);
    }
  }

  public static int getHeight(TreeNode root) {
    if(root == null) {
      return 0;
    }
    int lheight = getHeight(root.left);
    int rheight = getHeight(root.right);
    return Math.max(lheight,rheight)+1;
  }

  public static String sortString(String s) {

    String result = "";

    String sym = getSmallestCharacter(s);
    result+=sym;

    Map<Character,Character> map = new HashMap<>();
    map.put(sym.charAt(0),sym.charAt(0));
    String res = "";
    String res2 = getSmallestCharacter(s,map,res );


    return result;
  }

  static String getSmallestCharacter(String s) {
    char min = s.charAt(0);
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) < min) {
        min = s.charAt(i);
      }
    }
    return String.valueOf(min);
  }

  static String getSmallestCharacter(String s,Map<Character,Character> map, String res) {
    char min = '{';
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (map.get(c) ==null && c < min) {
        min = c;

      }
    }

    res+=String.valueOf(min);
    map.put(min,min);

    StringBuilder sNew = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == null) {
        sNew.append(s.charAt(i));
      }
    }

    if (s.length()>0) {
      getSmallestCharacter(sNew.toString(), map, res);
    }

    return res;

  }
}
