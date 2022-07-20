// 114. Linked List Cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode slowPointer = head;
        ListNode fastPointer = head.next;
        
        while(fastPointer.next != null && fastPointer.next.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer){
                return true;
            }
        }
        
        return false;
    }
}

/* 
Description:

Step 1 Brute Force: For each node, go through every single other node to see if it's next is equal to current node 0(n^2).

Step 2 Two pointers (Fast and slow): The slow pointer iterates through nodes 1 at a time, while the fast node iterates
two nodes at a time. If the slow node every catches up to fast node (aka they are the same), then there must be a cycle.

Problem Link: https://leetcode.com/problems/linked-list-cycle/
Good explanation: https://www.youtube.com/watch?v=6OrZ4wAy4uE
*/