package algorithms.array;

import algorithms.string.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
//        ListNode next4 = new ListNode(-5);
        ListNode next3 = new ListNode(4);
        ListNode next2 = new ListNode(3,next3);
        ListNode next1 = new ListNode(2, next2);
        ListNode listNode = new ListNode(1, next1);

        System.out.println(reverseList(listNode));

    }

    public static ListNode reverseList(ListNode head) {
        if (head==null)
            return head;
        StringBuilder stringBuilder = new StringBuilder();
        get(head, stringBuilder);
        String[] split = stringBuilder.toString().split(":");
        ListNode root = new ListNode(0);
        addVal(root, split,split.length-1);
        return root;
    }


    public static ListNode addVal(ListNode root, String[] split, int index) {
        String n = split[index];
        root.val = Integer.parseInt(n);
        if (index != 0) {
            root.next = new ListNode(Integer.parseInt(split[index-1]));
            index--;
            return addVal(root.next, split, index);
        }

        return root;
    }


    public static  void get(ListNode root, StringBuilder stringBuilder){
        int val = root.val;
        stringBuilder.append(val);
        if (root.next!=null){
            stringBuilder.append(":");
            get(root.next,stringBuilder);
        }
    }
}
