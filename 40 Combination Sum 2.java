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
             int insize=templist.size();
        for(int i=index+1;i<candidates.length;i++)
        {
            if(i>(index+1) && candidates[i]==candidates[i-1])
                continue;
            if(candidates[i]>remaining)
                break;   
           templist.add(candidates[i]);
          find(candidates,i,target,remaining-candidates[i],list,templist);
             templist.remove(insize);
        }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> x=new LinkedList<List<Integer>>();
        List <Integer> l=new ArrayList<Integer>();
        Arrays.sort(candidates);
          find(candidates,-1,target,target,x,l);        
        return x;
    }
}