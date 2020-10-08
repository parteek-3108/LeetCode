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
    public String tree2str(TreeNode t) {
        if(t==null)
            return "";
       String temp=String.valueOf(t.val);
        if(t.left!=null)
            temp+="("+tree2str(t.left)+")";
        if(t.right!=null)
        {
            if(t.left==null)
            temp+="()";
            temp+="("+tree2str(t.right)+")";
        }
        return temp;
    }
}