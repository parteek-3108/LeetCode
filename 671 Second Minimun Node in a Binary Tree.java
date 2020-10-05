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
    int fmin=-1,smin=-1;
    
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)
            return -1;
        if(root.val<fmin || (fmin==-1))
        {
            smin=fmin;
            fmin=root.val;        
        }
        else if((root.val<smin  || smin==-1) && root.val>fmin)
            smin=root.val;
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);
        return smin;
    }
}