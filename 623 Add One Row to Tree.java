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
    boolean dir=true;
    int t=0;
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1)
        {
            TreeNode ntn=new TreeNode(v);
            if(dir && t!=0)
                ntn.right=root;
            else if(!dir || t==0 )
                ntn.left=root;
            return ntn;
                
        }
        t=1;
            boolean t=dir; 
        if(root!=null)
        {
        dir=false;
        root.left=addOneRow(root.left,v,d-1);
         dir=true;
        root.right=addOneRow(root.right,v,d-1);
        dir=t;
        }
        return root;
    }
}