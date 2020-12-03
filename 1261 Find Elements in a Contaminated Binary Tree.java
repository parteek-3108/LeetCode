class FindElements {
    
    private Set<Integer> set;

    public FindElements(TreeNode root) {
        set = new HashSet<Integer>();
        fixRecursive(root, null);
    
    }
    
    private void fixRecursive(TreeNode node, TreeNode parent) {
        
        if (node == null)
            return;
        
        if (parent == null)
            node.val = 0;
        else
            node.val = node == parent.left? 2 * parent.val + 1
                        : 2 * parent.val + 2;
        
        set.add(node.val);
        
        fixRecursive(node.left, node);
        fixRecursive(node.right, node);
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class FindElements {
//     TreeNode root1;
// private TreeNode put(TreeNode root,int target)
// {
    
//     if(root==null)
//         return null;
//     System.out.println(target+" target");
//     root.val=target;
//     root.left=put(root.left,2*root.val+1);
//     root.right=put(root.right,2*root.val+2);
//     return root;
// }
//     public  FindElements(TreeNode root) {
//         root=put(root,0);
//         root1=root;
//     }
//     private boolean findinlist(TreeNode root,List <Integer>list,int index,int target)
//     {
        
//         if(root==null || index<0)
//             return false;
//          if(root.val==target)
//             return true;
//         else 
//         {
//         if(root.left!=null && root.left.val==list.get(index))
//         {
//             int t=index;
//             if(index==list.size()-1)
//                t++; 
//            return findinlist(root.left,list,index-1,target);
//         }
//         if(root.right!=null && root.right.val==list.get(index))
//         {
            
//            return findinlist(root.right,list,index-1,target);
//         }
       
       
//         return false;
            
//     }
//     }
//     public boolean find(int target) {
//         if(root1==null)
//             return false;
//         if(target==0)
//             return true;
//         List <Integer> list=new ArrayList<Integer>();
//         int t=target;
//         while(t!=0)
//         {
//           list.add(t);
//             if(t%2==0)
//                 t--;
//                 t=t/2;
            
//         }
//         list.add(t);
//         for(int i=list.size()-1;i>=0;i--)
//             System.out.println(list.get(i));
//         return findinlist(root1,list,list.size()-1,target);
        
//     }
// }

// /**
//  * Your FindElements object will be instantiated and called as such:
//  * FindElements obj = new FindElements(root);
//  * boolean param_1 = obj.find(target);
//  */