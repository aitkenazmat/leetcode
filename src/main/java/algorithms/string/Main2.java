package algorithms.string;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/*2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.


 */
public class Main2 {

    public static void main(String[] args) {

        getResult("9","999999999999999999999999999999999999999991");
//        ListNode l2 = new ListNode(3);
//        ListNode l1 = new ListNode(4,l2);
//        ListNode listNodeMain1 = new ListNode(2,l1);
//
//        ListNode l3 = new ListNode(4);
//        ListNode l4 = new ListNode(6,l3);
//        ListNode listNodeMain2 = new ListNode(5,l4);
//
//        ListNode result = addTwoNumbers(listNodeMain1, listNodeMain2);
//
//        System.out.println(result);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> integers1 = new LinkedList<>();
        List<Integer> integers2 = new LinkedList<>();
        getListIntegers(l1, integers1);
        getListIntegers(l2, integers2);
        return getResult(reverse(integers1),reverse(integers2));
    }


    public static List<Integer> getListIntegers(ListNode l1,List<Integer> integers){
        int val = l1.val;
        integers.add(val);
        if (l1.next!=null) {
            getListIntegers(l1.next, integers);
        }
        return integers;
    }

    public static String reverse(List<Integer> integers){
        StringBuilder sb = new StringBuilder();
        for (int i = integers.size()-1; i >= 0 ; i--) {
            sb.append(integers.get(i));
        }
        return sb.toString();
    }

    public static ListNode getResult(String s1, String s2){

        BigInteger bigInteger1 = new BigInteger(s1);
        BigInteger bigInteger2 = new BigInteger(s2);


        ListNode ln = null;
        BigInteger tmpRes = bigInteger1.add(bigInteger2);

        StringBuilder sb = new StringBuilder();
        for (int j = tmpRes.toString().toCharArray().length-1; j >=0 ; j--) {
            sb.append(tmpRes.toString().toCharArray()[j]);
        }
        List<Integer> digits = Arrays.stream(sb.toString().split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (Integer digit: digits) {
            ln =  addNode(ln, digit);
        }
        return ln;

    }

    public static ListNode addNode(ListNode rootNode , Integer val) {
        if (rootNode==null) {
            rootNode = new ListNode(val);
        } else {
            if (rootNode.next==null) {
                rootNode.next = new ListNode(val);
            } else {
                ListNode next = rootNode.next;
                addNode(next, val);
            }
        }
        return rootNode;
    }
}
