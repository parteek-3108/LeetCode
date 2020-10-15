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
    int len;
    public int find(TreeNode root,Map <Integer,Integer> map)
    {
        if(root==null)
            return 0;
        int t=find(root.left,map)+root.val+find(root.right,map);
        map.put(t,map.getOrDefault(t,0)+1);
        if(map.get(t)>max)
        { max=map.get(t);len=1;}
        else if(map.get(t)==max)
            len++;
        return t;
        
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        find(root,map);
        int a[]=new int[len];
        Set <Integer> set=map.keySet();
        Iterator <Integer> itr=set.iterator();
        int i=0;
        while(itr.hasNext())
        {
            int temp=itr.next();
            if(map.get(temp)==max)
                a[i++]=temp;
                
        }
        
        return a;
    }
}