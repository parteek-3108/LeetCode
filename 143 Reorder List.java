class Solution {
public void reorderList(ListNode head) {
            if(head==null||head.next==null) return;

            ListNode p1=head;
            ListNode p2=head;
            while(p2.next!=null&&p2.next.next!=null){ 
                p1=p1.next;
                p2=p2.next.next;
            }
            ListNode preMiddle=p1;
            ListNode preCurrent=p1.next;
            while(preCurrent.next!=null){
                ListNode current=preCurrent.next;
                preCurrent.next=current.next;
                current.next=preMiddle.next;
                preMiddle.next=current;
            }
        
            p1=head;
            p2=preMiddle.next;
            while(p1!=preMiddle){
                preMiddle.next=p2.next;
                p2.next=p1.next;
                p1.next=p2;
                p1=p2.next;
                p2=preMiddle.next;
            }
        }
}
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     Stack <ListNode> x;
//     int len;
//     int nv;
//     ListNode a[]=new ListNode[2];
//     public ListNode put(ListNode head,int count)
//     {
//         ListNode curr=head;
//         if(curr==null)
//         {
//             len=(count-1)/2;
//             nv=count/2;
//             a=new ListNode[len];
//             return null;
            
//         }
//      curr.next=put(curr.next,count+1);
        
//             if(count>nv)
//             {
//                 a[count-nv-1]=curr;
//                 return null;
//             }
//         else if(count<=len )
//         {
//             ListNode t=curr.next;
//             curr.next=x.pop();
//           curr.next.next=t;
//         }
//         return curr;
//     }
//     public void reorderList(ListNode head) {
//         x=new Stack<ListNode>();
//         int count=1;
//         if(head==null)
//             count=0;
//         else
//        head=put(head,count);
//     }
// }