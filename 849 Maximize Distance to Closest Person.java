class Solution {
    public int maxDistToClosest(int[] seats) {
        int start=-1;
        int max=0;
        int i=0;
        int count=0;
        for(i=0;i<seats.length;i++)
        {
            
            if(seats[i]==1)
                start=i;
            count=0;
            while(i<seats.length && seats[i]==0)
            {
                count++;
                i++;
            }
            if(start==-1  || i==seats.length)
               {
                   max=Math.max(count,max);
               }
            else
            {
                max=Math.max(max,count/2+count%2);
                start=i;
            }
            if(count!=0)
                i=i-1;
        }
        
        return max;
    }
}