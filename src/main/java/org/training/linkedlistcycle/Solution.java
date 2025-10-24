package org.training.linkedlistcycle;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> frequency = new HashMap<ListNode, Integer>();
        ListNode current = head;
        int pos = -1;
        while(current != null){
            // cycle = tail point an listnode
            //System.out.println("pos : "+ current.val);
            frequency.putIfAbsent(current , ++pos);
            if(frequency.containsKey(current)){
                System.out.println("position : => " + frequency.get(current));
                return true;
            }else{
                frequency.put(current , ++pos);
            }
            current = current.next;
        }
        System.out.println("position : => " + pos);
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
