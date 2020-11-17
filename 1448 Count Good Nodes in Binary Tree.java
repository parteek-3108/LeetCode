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
    int count=0;
    public void check(TreeNode root,int n)
    {
     if(root==null)
         return ;
         if(n<=root.val)
         { n=root.val;
         count++;}
                 
         check(root.left,n);
         check(root.right,n);
     
    }
    public int goodNodes(TreeNode root) {
        check(root,-100000);
        return count;
    }
}