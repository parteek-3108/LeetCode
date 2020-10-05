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
    int max=0;
    int h=0;
    Map <Integer,Integer> map;
    public void find(TreeNode root,int value,int height)
    {
        if(root==null)
            return ;
        if(height>h)
        {
            h=height;
            map.put(h,value);
        }
        find(root.left,2*value,height+1);
        find(root.right,2*value+1,height+1);
        max=Math.max(max,value-map.get(height)+1);
        
    }
    public int widthOfBinaryTree(TreeNode root) {
        map=new HashMap<Integer,Integer>();
       find(root,1,1);
        return max;
    }
}