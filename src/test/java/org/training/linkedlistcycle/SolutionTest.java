package org.training.linkedlistcycle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {


    private final Solution solution = new Solution();

    @Test
    public void whenThereIsOneCycle(){
        List<Integer> inputs = List.of(3, 2, 0, -4);
        ListNode head = new ListNode(inputs.getFirst());
        ListNode pres = null;
        ListNode tail = null;
        ListNode pos = head;
        for (int i = 1; i < inputs.size(); i++) {
            pres = pos;
            pos = new ListNode(inputs.get(i));
            if(inputs.get(i) ==2){ // tail
                tail = pos;
            }
            pres.next = pos;
        }
        pos.next = tail;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    public void whenThereIsCycleToFirstElement(){
        List<Integer> inputs = List.of(1,2);
        ListNode head = new ListNode(inputs.getFirst());
        ListNode pres = null;
        ListNode tail = head;
        ListNode pos = head;
        for (int i = 1; i < inputs.size(); i++) {
            pres = pos;
            pos = new ListNode(inputs.get(i));
            pres.next = pos;
        }
        pos.next = tail;
        assertTrue(solution.hasCycle(head));
    }

    @Test
    public void whenThereIsNoCycle(){
        List<Integer> inputs = List.of(1);
        ListNode head = new ListNode(inputs.getFirst());
        assertFalse(solution.hasCycle(head));
    }

    @Test
    public void whenInputIsLongList(){
        List<Integer> inputs = List.of(-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5);
        ListNode head = new ListNode(inputs.getFirst());
        ListNode pres = null;
        ListNode pos = head;
        for (int i = 1; i < inputs.size(); i++) {
            pres = pos;
            pos = new ListNode(inputs.get(i));
            pres.next = pos;
        }
        assertFalse(solution.hasCycle(head));
    }



}