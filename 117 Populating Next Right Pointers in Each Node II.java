/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    private Node find(Node root)
    {
        if(root==null)
            return root;
        Node temp=root.next;
        if(root.left!=null)
        {
            if(root.right!=null)
            {
                root.left.next=root.right;
            }
            else
            {
            while(temp!=null)
            {
                if(temp.left!=null)
                {
                    root.left.next=temp.left;
                    break;
                }
                else if (temp.right!=null)
                {
                    root.left.next=temp.right;
                    break;
                }
                temp=temp.next;
            }
            }
        }
        temp=root.next;
        if(root.right!=null)
        {
           while(temp!=null)
            {
                if(temp.left!=null)
                {
                    root.right.next=temp.left;
                    break;
                }
                else if (temp.right!=null)
                {
                    root.right.next=temp.right;
                    break;
                }
                temp=temp.next;
            }
        }
        root.right=find(root.right);
        root.left=find(root.left);
        return root;
    }
    public Node connect(Node root) {
        root=find(root);
        return root;
    }
}