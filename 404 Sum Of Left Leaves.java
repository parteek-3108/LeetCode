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
    int sum=0;
    public int find(TreeNode root,boolean dir) {
         if(root==null)
             return 0;
        if(root.left==null && root.right==null && dir==false)
            sum+=root.val;
           find(root.left,false);
            find(root.right,true);
       return 0;
    }
    public int sumOfLeftLeaves(TreeNode root) {
         
           find(root,true);
        return sum;
    }
}