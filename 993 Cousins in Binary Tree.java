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
    boolean res=false;
    public int check(TreeNode root,int x,int y)
    {
        if(root==null)
            return 0;
        if(root.val==x || root.val==y)
            return 1;
        int l=check(root.left,x,y);
        int r=check(root.right,x,y);
        if(l==r && l!=0 && !((root.left.val==x && root.right.val==y) || (root.left.val==y  && root.right.val==x)))
            res=true;
        if(l==0 && r==0)
            return l;
        if(l==0)
        return r+1;
        return l+1;
            
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        check(root,x,y);
        return res;
    }
}