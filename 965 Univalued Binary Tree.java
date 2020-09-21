/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean res=true;
    public int find(TreeNode root)
    {
        if(root==null)
            return -1;
        int l=find(root.left);
        int r=find(root.right);
        if(l==-1 && r==-1)
            return root.val;
        if(l==-1 && (r==root.val))
            return r;
        if(r==-1 && (l==root.val))
            return l;
        if(l!=r || l!=root.val )
            res=false;
        return root.val;
        
    }
    public boolean isUnivalTree(TreeNode root) {
        find(root);
        return res;
    }
}