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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> temp=new ArrayList<ListNode>();
        if(head==null || head.next==null)
            return null;
        while(head!=null)
        {
         temp.add(head);
            head=head.next;
        }
        int index=temp.size()-n;
        if(index==0)
        {
            return temp.get(1);
        }
        temp.get(index-1).next=temp.get(index).next;
        return temp.get(0);
    }
}