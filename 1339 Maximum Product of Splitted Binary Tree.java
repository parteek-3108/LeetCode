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
    public long findmax(TreeNode t,long s)
    {
        if(t==null)
            return 0;
        long temp=findmax(t.left,s)+findmax(t.right,s)+t.val;
        if((s-temp)*temp>max)
        {
            max=(s-temp)*temp;
        }      
            return temp;
    }
    long max=0;
    public int maxProduct(TreeNode root) {
     long sum=findmax(root,0);
        findmax(root,sum);
        return (int)(max%(1000000007));
    }
}