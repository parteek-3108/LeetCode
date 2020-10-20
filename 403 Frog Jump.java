class Solution {
boolean res[][];
    private boolean find(int [] stone,int ind,int step)
    {
        
        if(ind==(stone.length-1))
            return true;
        if(ind>=stone.length)
            return false;
        if(res[ind][step])
            return false;
        int t=ind+1;
        while(t<(stone.length) && stone[t]<=(stone[ind]+step+1))
        {
            boolean result=false;
            if((stone[ind]+step)==stone[t])
            {
                result=find(stone,t,step);
            }
            else if((stone[ind]+step-1)==stone[t] && (step-1)>0)
            {
                result=find(stone,t,step-1);
            }
            else if((stone[ind]+step+1)==stone[t])
            {
                result=find(stone,t,step+1);
            }
            if(result)
            {
                return true;
            }
            t++;
        }
        res[ind][step]=true;
        return false;
    }
    public boolean canCross(int[] stones) {
        res=new boolean[stones.length][1100];
        return find(stones,0,0);
    }
}