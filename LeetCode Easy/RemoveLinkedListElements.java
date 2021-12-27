/* 203. Remove Linked List Items */

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

/*
Description: Given the head of a linked list and an integer val, remove all the nodes of the 
linked list that has Node.val == val, and return the new head.

Step 1 Brute Force: Create dummy node head. Go through every linked list item and see if it matches integer.
*/