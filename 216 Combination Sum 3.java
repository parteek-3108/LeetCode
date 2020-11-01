
class Solution {
    
    public void find(int num,int remaining,int slength,List <List<Integer>> list,List <Integer>
    templist)
    {
        if(remaining==0 && templist.size()==slength)
        {
           list.add(new ArrayList<Integer>(templist)); 
        }    
        if(remaining>0 && templist.size()<slength)
        {
        for(int i=num+1;i<=9;i++)
        {
            if(i<=remaining)
            {
           templist.add(i); 
          find(i,remaining-i,slength,list,templist);
             templist.remove(templist.size()-1);
            }
            else break;
        }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> x=new ArrayList<List<Integer>>();
        List <Integer> l=new ArrayList<Integer>();
          find(0,n,k,x,l);
            
        
        return x;
    }
}