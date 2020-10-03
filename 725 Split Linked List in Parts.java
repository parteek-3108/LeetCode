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
    public ListNode[] splitListToParts(ListNode root, int k) {
      ListNode temp=root;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        int nec=size/k;
        int rem=size%k;
        ListNode t[]=new ListNode[k];
        for(int i=0;i<k;i++)
        {
        int temp1=nec;
            if(rem-->0)
                temp1++;
            ListNode temp2=null;
            while(temp1>0)
            {
                if(t[i]==null)
                {
                    t[i]=root;
                    temp2=t[i];
                }
                else
                {
                  root=root.next;  
                temp2=temp2.next;
                
                }
                temp1--;
            }
            if(root!=null)
                root=root.next;
            if(temp2!=null)
            temp2.next=null;
            
        }
        return t;
        }
}