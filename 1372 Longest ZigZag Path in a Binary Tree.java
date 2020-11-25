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
    int max = 0; //Each node's value is between [1, 100].
    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root.left, 0, false);    // let false be for left and true be for right
        dfs(root.right, 0, true);
        return max;
    }
    public void dfs(TreeNode node, int depth, boolean directionLeftOrRight) {
        max = Math.max(max, depth);
        if (node == null)
            return;
        dfs(node.left, (directionLeftOrRight) ? depth+1:0, false);
        dfs(node.right, (!directionLeftOrRight) ? depth+1:0, true);
    }
}