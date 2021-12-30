// 206. Reverse Linked List

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode holdPrevNode = null;
        ListNode holdNextNode = new ListNode(0, null);
        
        if (head == null || head.next == null){
            return head;
        }
        
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null){
            holdNextNode = currentNode.next;
            currentNode.next = holdPrevNode;
            holdPrevNode = currentNode;
            currentNode = holdNextNode;
        }
        currentNode.next = holdPrevNode;
        return currentNode;
    }
}

/*
Description: Given the head of a linked list, reverse the list and return it

Step 1: Go through the list of nodes. Keep track of previous node and next node. Return last item (new head)

Solved in 46:19
*/