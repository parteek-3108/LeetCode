class Solution {
   static int a[][]=new int[2][2];
Map <Integer,List<Integer>> x=new HashMap<Integer,List<Integer>>();
    public int find(List<List<Integer>> triangle,int i,int j)
    {
        if(i==(triangle.size()-1))
        {
            return triangle.get(i).get(j);
        }
        if(x.containsKey(i) && x.get(i).size()!=j)
        {
            return x.get(i).get(j);
        }
        int left=(triangle.get(i)).get(j)+find(triangle,i+1,j);
        int right=triangle.get(i).get(j)+find(triangle,i+1,j+1);
        if(left<right)
        {
           if(!x.containsKey(i))
        {
             List <Integer>t=new ArrayList<Integer>();
               t.add(left);
            x.put(i,t);
        }
        else
        {
            x.get(i).add(left);
        }
            return left;
        }
        
        if(!x.containsKey(i))
        {
            List <Integer>t=new ArrayList<Integer>();
            t.add(right);
            x.put(i,t);
        }
        else
        {
            x.get(i).add(right);
        }
        return right;
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        a=new int[triangle.size()][triangle.size()];
       return find(triangle,0,0);
    }
}