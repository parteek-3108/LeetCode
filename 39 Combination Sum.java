class Solution {
    public void find(int candidates[],int index,int target,int remaining,List <List<Integer>> list,List <Integer>
    templist)
    {
        if(remaining==0)
        {
           list.add(new ArrayList<Integer>(templist)); 
        }
        if(remaining>0)
        {
        for(int i=index;i<candidates.length;i++)
        {
            if(candidates[i]<=remaining)
            {
           templist.add(candidates[i]); 
          find(candidates,i,target,remaining-candidates[i],list,templist);
             templist.remove(templist.size()-1);
            }
        }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> x=new LinkedList<List<Integer>>();
        List <Integer> l=new ArrayList<Integer>();
          find(candidates,0,target,target,x,l);
            
        
        return x;
    }
}