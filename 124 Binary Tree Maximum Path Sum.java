class Solution {
    int sum=0;
    private int find(TreeNode root,int sum1)
    {
        if(root==null)
        {
            sum=Math.max(sum,sum1);
            return sum1;
        }
        int passed=0;
        if(sum1<0)
        {
            passed=root.val>0?root.val:0;            
        }
        else
            passed=sum1;
        int left=0,right=0;
        if(root.left!=null)
       left=find(root.left,passed+root.left.val);
        if(root.right!=null)
        right=find(root.right,passed+root.right.val);
             int t=Math.max(Math.max(sum1+left,sum1+right),(left+right+root.val));
            sum=Math.max(Math.max(sum,t),root.val);
            return Math.max(Math.max(left+root.val,right+root.val),root.val);
         }
    public int maxPathSum(TreeNode root) {
        
        if(root!=null)
        {sum=root.val;find(root,root.val);}
        
        return sum;
    }
}