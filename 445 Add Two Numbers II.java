class Solution {
    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        l1 = reverse (l1);
        l2 = reverse (l2);
        ListNode head = new ListNode (0);
        int sum = 0, carry = 0;
        ListNode curr1 = l1, curr2 = l2;
        while (curr1 != null && curr2 != null) {
            sum = (curr1.val + curr2.val + carry) % 10;
            carry = (curr1.val + curr2.val + carry) / 10;
            ListNode newNode = new ListNode (sum);
            newNode.next = head.next;
            head.next = newNode;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while (curr1 != null) {
            sum = (curr1.val + carry) % 10;
            carry = (curr1.val + carry) / 10;
            ListNode newNode = new ListNode (sum);
            newNode.next = head.next;
            head.next = newNode;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            sum = (curr2.val + carry) % 10;
            carry = (curr2.val + carry) / 10;
            ListNode newNode = new ListNode (sum);
            newNode.next = head.next;
            head.next = newNode;
            curr2 = curr2.next;
        }
        if (carry == 1) {
            ListNode newNode = new ListNode (1);
            newNode.next = head.next;
            head.next = newNode;
        }
        return head.next;
    }
    
    public ListNode reverse (ListNode head) {
        Stack <ListNode> stack = new Stack ();
        ListNode curr = head;
        while (curr != null) {
            stack.push (curr);
            curr = curr.next;
        }
        ListNode newHead = stack.pop ();
        curr = newHead;
        while (!stack.isEmpty ()) {
            curr.next = stack.pop ();
            curr = curr.next;
        }
        curr.next = null;
        return newHead;
    }
}