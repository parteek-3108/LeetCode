/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    TreeMap<Integer,List<Integer>> x;
   private void find(Node root,int hi)
    {
        if(root==null)
            return ;
       for(int i=0;i<root.children.size();i++)
       find(root.children.get(i),hi+1);
       if(!x.containsKey(hi))
          x.put(hi,new ArrayList<Integer>());
       x.get(hi).add(root.val);
   }
    public List<List<Integer>> levelOrder(Node root) {
        x=new TreeMap<Integer,List<Integer>>();
        find(root,0);
        Set <Integer> set=x.keySet();
        ArrayList <List<Integer>> res=new ArrayList<List<Integer>>();
        for(int s:set)
        {
         res.add(x.get(s));   
        }
        return res;
    }
}