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
    int result=0;
    int h=-1;
    private void find(TreeNode root,int hi)
    {
        if(root==null)
            return ;
        find(root.left,hi+1);
        find(root.right,hi+1);
        if(hi>h)
        {
            h=hi;
            result=root.val;
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        find(root,0);
        return result;
    }
}