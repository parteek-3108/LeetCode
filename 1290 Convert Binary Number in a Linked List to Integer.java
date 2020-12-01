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
     int sum=0;
    private int find(ListNode head)
    {
     if(head==null)
         return 1;
        int prod=find(head.next);
        sum+=prod*head.val;
        return prod*2;
    }
    public int getDecimalValue(ListNode head) {      
        find(head);
        return sum;
    }
}