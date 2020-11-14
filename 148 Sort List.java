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
    TreeMap <Integer,Integer> set=new TreeMap<Integer,Integer>();
    public ListNode find(ListNode head,int n)
    {
       if(head==null)
           return null;
        if(head.val<n)
        {
            set.put(head.val,set.getOrDefault(head.val,0)+1);
            return find(head.next,n);
        }
        else
        {
            head.next=find(head.next,head.val);
        }
        while(!set.isEmpty() && set.lastKey()>head.val)
        {
            ListNode t=head.next;
            head.next=new ListNode(set.lastKey());
            head.next.next=t;
            set.put(set.lastKey(),set.getOrDefault(set.lastKey(),0)-1);
            if(set.get(set.lastKey())==0)
            set.remove(set.lastKey());
        }
        return head;
    }
    public ListNode sortList(ListNode head) {
      ListNode temp=find(head,0);
        while(!set.isEmpty())
        {
            ListNode t=new ListNode(set.lastKey());
            t.next=temp;
            temp=t;
            set.put(set.lastKey(),set.getOrDefault(set.lastKey(),0)-1);
            if(set.get(set.lastKey())==0)
            set.remove(set.lastKey());
        }
        return temp;
    }
}