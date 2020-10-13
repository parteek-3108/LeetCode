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
    int res=0;
    public int find(TreeNode root)
    {
     if(root==null)
            return 0;
        int t=find(root.left);
        int t2=find(root.right);
        if((t+t2)>res)
            res=t+t2;
        return Math.max(t+1,t2+1);   
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null))
            return 0;
    find(root);
        return res;
    }
}