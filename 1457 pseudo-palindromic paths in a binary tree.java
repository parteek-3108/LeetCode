class Solution {
    public int pseudoPalindromicPaths (TreeNode root) {
        return dfs(root, 0);
    }
    public int dfs(TreeNode root, int mask) {
        if (root == null) return 0;
        mask = mask ^ (1 << root.val);
        if (root.left == null && root.right == null) {
            if (mask == 0 || (mask & (mask-1)) == 0) return 1;
            return 0;
        }
        return dfs(root.left, mask) + dfs(root.right, mask);
    }
}