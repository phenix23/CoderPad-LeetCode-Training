package org.training.addtwonumbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void whenTwoListNodes(){
     ListNode l1 = buildListNode(List.of(2,4,3));
     ListNode l2= buildListNode(List.of(5,6,4));
     ListNode expected = buildListNode(List.of(7, 0, 8));
     assertEquals(expected , solution.addTwoNumbers(l1 , l2));
    }

    @Test
    public void whenTwoListNodesWithOnlyOneZero(){
        ListNode l1 = buildListNode(List.of(0));
        ListNode l2= buildListNode(List.of(0));
        ListNode expected = buildListNode(List.of(0));
        assertEquals(expected , solution.addTwoNumbers(l1 , l2));
    }

    @Test
    public void whenTwoListNodesDifferentSize(){
        ListNode l1 = buildListNode(List.of(9,9,9,9,9,9,9));
        ListNode l2= buildListNode(List.of(9,9,9,9));
        ListNode expected = buildListNode(List.of(8,9,9,9,0,0,0,1));
        assertEquals(expected , solution.addTwoNumbers(l1 , l2));
    }

    @Test
    public void whenTwoListNodesDifferentSizeUC2(){
        ListNode l1 = buildListNode(List.of(9));
        ListNode l2= buildListNode(List.of(1,9,9,9,9,9,9,9,9,9));
        ListNode expected = buildListNode(List.of(0,0,0,0,0,0,0,0,0,0,1));
        assertEquals(expected , solution.addTwoNumbers(l1 , l2));
    }

    @Test
    public void whenTwoListNodesDifferentSizeUC3(){
        ListNode l1 = buildListNode(List.of(1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1));
        ListNode l2= buildListNode(List.of(5,6,4));
        ListNode expected = buildListNode(List.of(6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1));//10^30
        assertEquals(expected , solution.addTwoNumbers(l1 , l2));
    }

    private static ListNode buildListNode(List<Integer> list) {
        ListNode l = new ListNode(list.getFirst());
        ListNode current = l;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return l;
    }
}