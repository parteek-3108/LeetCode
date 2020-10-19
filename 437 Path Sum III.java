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
    HashMap<Integer,Integer> m; 
    int ans = 0;
   public void dfs(TreeNode root,int curr, int sum){
        if(root == null){
            return;
        }
        
        int temp = curr + root.val;
        if(m.containsKey(temp - sum)){
            ans += m.get(temp - sum);
            // System.out.println(root.val+" ans");
        }
        
        
        // System.out.println(temp+" sum so far");
        
        if(m.containsKey(temp)){
            int v = m.get(temp);
            v++;
            m.put(temp,v);
        }else{
            m.put(temp,1);
        }
        
        dfs(root.left,temp,sum);
        dfs(root.right,temp,sum);
        
        if(m.containsKey(temp)){
            int geto = m.get(temp);
            geto--;
            if(geto == 0){
                m.remove(temp);
            }else{
                m.put(temp,geto);
            }
            
        }
        
    }
    
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return 0;
        }
        m = new HashMap<> ();
        m.put(0,1);
        dfs(root,0,sum);
        return ans;
    }
}
