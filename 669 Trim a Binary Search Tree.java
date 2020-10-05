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
    public TreeNode delete(TreeNode root)
    {
        TreeNode t=root.right;
        while(t.left!=null){
            t=t.left;
        }
        root.val=t.val;
        t=null;
        return root;
    }
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null)
            return root;
        if(root.left!=null){
           root.left=trimBST(root.left,L,R); 
        }
        if(root.right!=null){
           root.right=trimBST(root.right,L,R); 
        }
        if(root.val<L || root.val>R){
            
            if(root.left==null && root.right==null){
                return null;
            }
        else if(root.left==null || root.right==null){
            
            if(root.left==null)
            {
                return root.right;
            }
            else
            {
                return root.left;
            }
        }
          else
          {
              return delete(root);
          }
        }
        return root;
    }
}