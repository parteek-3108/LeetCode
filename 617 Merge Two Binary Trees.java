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
    public TreeNode find(TreeNode root,TreeNode t1,TreeNode t2)
    {
        if(t1==null && t2==null)
        {
            return null;
        }
            root=new TreeNode();
        TreeNode l1=null,r1=null,l2=null,r2=null;
        int sum=0;
        if(t1!=null)
        {sum+=t1.val;l1=t1.left;r1=t1.right;}
        if(t2!=null)
        {sum+=t2.val;l2=t2.left;r2=t2.right;}
        root.val=sum;
        root.left=find(root.left,l1,l2);
        root.right=find(root.right,r1,r2);
        return root;
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)
            return null;
       TreeNode root=find(null,t1,t2);
            
        return root;
    }
}