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
    Map<Integer,Integer> map;
    private void find(TreeNode root,int h)
    {
        if(root==null)
            return ;
        
        map.put(h,root.val);
        find(root.left,h+1);
        find(root.right,h+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        map=new HashMap<Integer,Integer>();
        find(root,0);
        Set <Integer> set=map.keySet();
        List<Integer> list=new ArrayList<Integer>();
        for(int s:set)
        {
          list.add(map.get(s));  
        }
        return list;
    }
}