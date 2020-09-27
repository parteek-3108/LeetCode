class Solution {
    List<Integer> seq1 = new ArrayList<Integer>();
    List<Integer> seq2 = new ArrayList<Integer>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverseTree(root1,seq1);
        traverseTree(root2,seq2);
        return seq1.equals(seq2);
    }
    
    public void traverseTree(TreeNode root, List<Integer> l){
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            l.add(root.val);
        traverseTree(root.left,l);
        traverseTree(root.right,l);
    }
}