/*
https://leetcode.com/problems/remove-linked-list-elements/

Given the head of a linked list and an integer val, remove all the nodes of the 
linked list that has Node.val == val, and return the new head.

Constraints:
- The number of nodes in the list is in the range [0, 104].
- 1 <= Node.val <= 50
- 0 <= val <= 50

Lessons Learned:
- While loop is good to loop through linked list (unknown length)
- For single linked list, only have to worry about .next
- Dummy head can be helpful strategy for Linked List problems to get off by one errors
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode currentNode = dummyHead;
        
        while(currentNode.next != null){
            
            if(currentNode.next.val == val){
                if (currentNode.next.next != null){
                    currentNode.next = currentNode.next.next;
                } else{
                    currentNode.next = null;
                    break;
                }
            } else{
                currentNode = currentNode.next;
            }
             
        }
        
        return dummyHead.next;
    }
}

