package algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class InvertBinaryTree {

  public static void main(String[] args) {

    minPartitions("27346209830709182346");


  }

  public static int minPartitions(String n) {
    int max = Integer.MIN_VALUE;
    for(int i =0;i<n.length();i++){
      int k= (n.charAt(i)-'0');
      max = Math.max(max,k);
    }
    return max;
  }


  public static int numberOfMatches(int n) {
    int i = numberOfMatches(n, 0);
    return i;
  }

  public static int numberOfMatches(int n, int x) {
    if (n>1) {
      int a = n / 2;
      x+=a;
      int b = n - a;
      return numberOfMatches(b, x);
    }

    return x;
  }




  public static List<Integer> getRow(int rowIndex) {

    List<List<Integer>> response = new ArrayList<>();
    List<Integer> fff  = new ArrayList<>();
    for (int i = 0; i <= rowIndex; i++) {
      fff = genn(i + 1, fff);
      response.add(fff);
    }

    return response.get(response.size()-1);
  }

  public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> response = new ArrayList<>();
    List<Integer> fff  = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      fff = genn(i + 1, fff);
      response.add(fff);
    }

    return response;

  }

  public static List<Integer> genn(int level, List<Integer> previewList) {

    if (level < 3) {
      List<Integer> integers = new ArrayList<>(level);
      for (int i = 0; i < level; i++) {
        integers.add(1);
      }
      return integers;

    } else {
      int next = 0;
      LinkedList<Integer> integers = new LinkedList<>();

      integers.add(next, 1);
      integers.addLast(1);

      for (int i = 0; i < previewList.size(); i++) {
        next++;
        int h = previewList.get(i) + previewList.get(i+1);
        integers.add(next,h);
        if (integers.size() ==  previewList.size()+1) {
          return integers;
        }

      }
      return integers;
    }
  }

  public static int arraySign(int[] nums) {
    int count  = 0;
    for(int i=0; i < nums.length; i++) {
      if (nums[i]==0) {
        return 0;
      } else if (nums[i]< 0) {
        count++;
      }
    }

    if (count % 2 ==1) {
      return -1;
    }

    return 1;
  }


  public static int removePalindromeSub(String s) {
    if (isPalindrome(s)) {
      return 1;
    } else {
      for (int i = 0; i < s.length(); i++) {
        String s1 = removeByIndex(s, i);
        if (isPalindrome(s1)) {
          return 2;
        }
      }
    }


    return 2;
  }

  static String removeByIndex(String s, int index) {
    StringJoiner sj = new StringJoiner("");
    for (int i = 0; i < s.length(); i++) {
      if (i!= index) {
        sj.add(String.valueOf(s.charAt(i)));
      }
    }

    return sj.toString();
  }


  static Boolean isPalindrome(String s ){
    StringJoiner sj = new StringJoiner("");
    for (int i = s.length()-1; i >= 0 ; i--) {
      sj.add(String.valueOf(s.charAt(i)));
    }
    return sj.toString().equals(s);
  }
  public static int[] sumZero(int n) {
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = i+1;
      sum+= i +1 ;
    }
    int z = sum-n;
    arr[n-1] = -z;


    return arr;
  }

  public static boolean isCousins(TreeNode root, int x, int y) {

    int stepR = 0;
    int stepY = 0;
    TreeNode treeNodeX = defineX(root,root, x, stepR);
    TreeNode treeNodeY = defineX(root,root, y, stepY);

    return false;
  }

  public static TreeNode defineX(TreeNode root,TreeNode child, int x, int step) {
    if (child==null)
      return child;

    if (child.val == x) {
      return child;
    }

    defineX(root,child.right, x, ++step);
    return defineX(root, child.left, x, ++step);
  }
}
