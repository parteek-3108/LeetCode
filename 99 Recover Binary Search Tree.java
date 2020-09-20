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
    TreeNode f=null,s=null;
    private void Inorder(TreeNode root)
    {
        if(root==null)
            return ;
        
        Inorder(root.left);
        if((f==null || f.val<root.val) && s==null)
          f=root;
        if(root.val<f.val)
            s=root;
        Inorder(root.right);
        
    }
    public void recoverTree(TreeNode root) {
        Inorder(root);
        if(f!=null && s!=null)
        {
            int t=f.val;
            f.val=s.val;
            s.val=t;
        }
    }
}