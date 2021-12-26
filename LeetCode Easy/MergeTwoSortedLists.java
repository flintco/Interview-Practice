// 21. Merge Two Sorted Lists

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //create dummy head
        ListNode headNode =  new ListNode(0);
        
        //create topOfList1, topOfList2, and last node
        ListNode topOfList1 = list1;
        ListNode topOfList2 = list2;
        ListNode lastNode = headNode;
        
        //Choose the smaller node
        while (topOfList1 != null || topOfList2 != null){
            if (topOfList1 == null){
                //System.out.println("1. Top of List One: " + topOfList1 + ", Top of List Two: " + topOfList2 + " Last node: " + lastNode);
                lastNode.next = topOfList2;
                lastNode = topOfList2;
                if (topOfList2.next != null){
                    topOfList2 = topOfList2.next;
                } else {
                    break;
                }
                System.out.println("1");
            } else if (topOfList2 == null){
                //System.out.println("1. Top of List One: " + topOfList1 + ", Top of List Two: " + topOfList2 + " Last node: " + lastNode);
                lastNode.next = topOfList1;
                lastNode = topOfList1;
                if (topOfList1.next != null){
                    topOfList1 = topOfList1.next;
                } else {
                    break;
                }
                System.out.println("2");
            } else if (topOfList1.val > topOfList2.val){
                //System.out.println("Here");
                lastNode.next = topOfList2;
                lastNode = topOfList2;
                topOfList2 = topOfList2.next;
                //System.out.println("3 " + topOfList1 + " Last node: " + lastNode);
            } else if (topOfList1.val <= topOfList2.val){
                //System.out.println("Here");
                lastNode.next = topOfList1;
                lastNode = topOfList1;
                topOfList1 = topOfList1.next;
                //System.out.println("4 " + topOfList1 + " Last node: " + lastNode);
            } else {
                System.out.print("Error");
            }
        }
        
        if(headNode.next == null){
            return null;
        } else{
            return headNode.next;
        }  
        
    }
}

/*
Description: Given heads of two sorted linked lists, return a linked list sorting two lists together.

Step 1 Brute Force: Create a dummy head node. Pick node with smaller value and head of two lists and continue until went through both of lists.

Completed in 1:00:46

Took much longer than planned because I had a typo in while loop.
*/