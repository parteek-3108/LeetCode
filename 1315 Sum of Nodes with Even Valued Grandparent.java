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
    private void construct(TreeNode root,int h)
    {
        if(root==null)
            return ;
        if(h==0)
            sum+=root.val;
        else
        {
            construct(root.left,h-1);
            construct(root.right,h-1);
        }
    }
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null)
            return 0;
        if((root.val&1)==0)
            construct(root,2);
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
        return sum;
    }
}