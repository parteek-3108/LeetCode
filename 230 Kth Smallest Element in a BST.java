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
    int K=3;
    private int find(TreeNode root,int k)
    {
if(root==null)
    return -1;
        int l=find(root.left,k);
        if(l!=-1)
            return l;
        else
        {
            K=K-1;
            if(K==0)
            return root.val;
        }
        // System.out.println(l+"left "+root.val);
        int r=find(root.right,k);
        if(r!=-1)
            return r;
        // System.out.println(r+"right "+root.val);
        
        
        return -1;
            
    }
    public int kthSmallest(TreeNode root, int k) {
        K=k;
       return find(root,k);
        
    }
}