/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode max=new TreeNode(100000000);
    public int lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return -2;
        int l=lowestCommonAncestor2(root.left,p,q);
        if(l>-1 )
        {
            return root.val;
        }
        int r=lowestCommonAncestor2(root.right,p,q);
        if(r>-1)
        {
            return root.val;
        }
        if(l==-1 && r==-1)
        {max=root;
        return root.val;}
        if(root.val==p.val || root.val==q.val)
        {
            if(l==-1 || r==-1)
            {max=root;return root.val;}
            return -1;
        }
        if(l==-2 && r==-2)
            return -2;
        
        return -1;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root==null)
            return null;
        lowestCommonAncestor2(root,p,q);
        return max;
    }
}