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
    public List<Integer> find(TreeNode root,List <Integer> s)
    {
        if(root==null)
            return s;
        s.add(root.val);
        s=find(root.left,s);
        return find(root.right,s);
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> s=new LinkedList<Integer>();
        if(root==null)
            return s;
        return find(root,s);
    }
}