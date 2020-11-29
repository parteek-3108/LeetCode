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
import java.util.*;
class Solution {
    TreeMap <Integer,Integer>x=new TreeMap<Integer,Integer>();
    public void input(TreeNode root)
    {
        if(root!=null)
        {
            input(root.left);
            input(root.right);
            if(x.containsKey(root.val))
                x.put(root.val,x.get(root.val)+1);
            else
                x.put(root.val,1);
        }
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        input(root1);
        input(root2);
        List<Integer> list=new ArrayList<Integer>();
        Set <Integer>set=x.keySet();
        Iterator <Integer> iter=set.iterator();
        while(iter.hasNext())
        {
            int i=iter.next();
            while(x.get(i)>0)
            {
                list.add(i);
                x.put(i,x.get(i)-1);
            }
        }
        return list;
    }
}