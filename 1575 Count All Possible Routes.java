class Solution {
    int store[][]=new int[3][3];
    public int find(int []locations,int init,int finish,int fuel)
    {
       if(fuel<0)
           return 0;
        int count=0;
        if(finish==init)
            count++;
                if(fuel==0)
            return count;
        if(store[init][fuel-1]!=0)
        {  
            if(store[init][fuel-1]==-1)
         return 0;
        else
         return store[init][fuel-1];}
        
        for(int i=0;i<locations.length;i++)
        {
            if(i==init)
                continue;
            count+=find(locations,i,finish,fuel-Math.abs(locations[i]-locations[init]));
            count%=1000000007;
        }
        
        if(count==0)
            store[init][fuel-1]=-1;
        else
        store[init][fuel-1]=count;
        return count;
    }
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
       store=new int[locations.length][fuel];
        return find(locations,start,finish,fuel);
    }
}