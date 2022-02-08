package algorithms.array;

import algorithms.string.ListNode;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode next3 = new ListNode(3);
        ListNode next2 = new ListNode(2,next3);
        ListNode next1 = new ListNode(2, next2);
        ListNode listNode = new ListNode(1, next1);

        System.out.println(isPalindrome(listNode));
    }

    public static boolean isPalindrome(ListNode head) {

        StringBuilder stringBuilder = new StringBuilder();
        get(head, stringBuilder);

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(stringBuilder);

        return stringBuilder1.reverse().toString().equals(stringBuilder.toString());
    }


    public static  void get(ListNode root, StringBuilder stringBuilder){
        int val = root.val;
        stringBuilder.append(val);
        if (root.next!=null){
            get(root.next,stringBuilder);
        }
    }
}
