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
    TreeNode fin=null;
    TreeNode temp=null;
    public TreeNode increasingBST(TreeNode root) {
        if(root.left!=null)
            increasingBST(root.left);
        if(fin==null)
        {
        fin=new TreeNode(root.val);
            temp=fin;
        }
        else
        {
            temp.right=new TreeNode(root.val);
            temp=temp.right;
        }
        if(root.right!=null)
            increasingBST(root.right);
        return fin;
            
    }
}