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
    int s=0;
    public void find(TreeNode root,int num)
    {
        if(root.left==null && root.right==null)
            s+=num*10+root.val;
        if(root.left!=null)
        find(root.left,num*10+root.val);
        if(root.right!=null)
        find(root.right,num*10+root.val);
        
        
    }
    public int sumNumbers(TreeNode root) {
      
        if(root==null)
            return 0;
        find(root,0);
        return s;
    }
}