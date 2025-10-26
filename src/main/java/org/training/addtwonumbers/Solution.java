package org.training.addtwonumbers;

import java.math.BigInteger;
import java.util.Objects;

public class Solution {

    /*
     * Perfect Solution Runtime Complexity / Memory complexity
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Loop while there is at least one node left or carry != 0
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
      }
     */
    public ListNode addTwoNumbers(ListNode l1 , ListNode l2){
        // read ListNode
        String num1 = readListNode(l1);
        String num2 = readListNode(l2);
        // reverse order
        String reverseNum1 = reverse(num1);
        String reverseNum2 = reverse(num2);
        // calculate sum
        BigInteger sum = new BigInteger(reverseNum1).add(new BigInteger(reverseNum2));
        // reverse sum
        String sumStr = reverse(sum.toString());
        // create new ListNode with result of sum
        return createListNode(sumStr);
    }

    private String readListNode(ListNode l1) {
        String num = "";
        while (l1 != null){
            num += String.valueOf(l1.val);
            l1 = l1.next;
        }
        return num;
    }

    private String reverse(String num1) {
        String reversed = "";
        for (int i = num1.length() - 1; i > -1 ; i--) {
            reversed += num1.charAt(i);
        }
        return reversed;
    }

    private ListNode createListNode(String sumStr) {
        String[] digits = sumStr.split("");
        ListNode sumL = new ListNode(Integer.valueOf(digits[0]));
        ListNode current = sumL;
        for (int i = 1; i < digits.length ; i++) {
            current.next = new ListNode(Integer.valueOf(digits[i]));
            current = current.next;
        }
        return sumL;
    }
}

class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) {
           this.val = val;
           this.next = next;
       }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}