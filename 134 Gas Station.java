class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s=0;
        int ts=0;
        int index=-1;
        for(int i=0;i<gas.length;i++)
        {
            ts=gas[i]-cost[i];
            index=-1;
            while(i<gas.length && ts>=0)
            {
                s+=(gas[i]-cost[i]);
                if(index==-1)
                    index=i;
                i++;
                if(i<gas.length)
                ts+=(gas[i]-cost[i]);
                
            }
            if(i<gas.length)
            s+=(gas[i]-cost[i]);
            
           
        }
        if(s>=0)
            return index;
        return -1;
    }
}