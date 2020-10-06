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
    Map<String,Boolean> map;
    List <TreeNode> list;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map=new HashMap();
        list=new ArrayList();
        find(root);
        return list;
    }
    public String find(TreeNode root)
    {
        if(root == null)
            return "N";
        String left = find(root.left);
        String right = find(root.right);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(root.val));
        sb.append(",");
        sb.append(left);
        sb.append(",");
        sb.append(right);
        String res = sb.toString();
        if(!map.containsKey(res)){
           map.put(res,false); 
        }
        else if(map.containsKey(res) && !map.get(res)){
            map.put(res,true);
            list.add(root);
        }
        return res;
    }
}