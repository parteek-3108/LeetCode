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
    int h=0;
    List <Integer> list;
    public void find(TreeNode root,int hi)
    {
        if(root==null)
            return ;
        find(root.left,hi+1);
        find(root.right,hi+1);
        if(hi>h)
        {h=hi;
           list=new ArrayList<Integer>();}
        if(hi>=h)
            list.add(root.val);
        //System.out.println("size "+list.size()+" height "+hi+" h "+h);
            
    }
    public int deepestLeavesSum(TreeNode root) {
        list=new ArrayList<Integer>();
        find(root,1);
        int sum=0;
        for(int i=0;i<list.size();i++)
            sum+=list.get(i);
        return sum;
    }
}