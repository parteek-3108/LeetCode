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
    private TreeNode construct(int nums[],int first,int last)
    {
        if(first>last)
            return null;
      int index=first;
        for(int i=first;i<=last;i++)
        {
            if(nums[i]>nums[index])
                index=i;
        }  
        TreeNode t=new TreeNode(nums[index]);
        t.left=construct(nums,first,index-1);
        t.right=construct(nums,index+1,last);
        return t;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
}