class Solution {
    public int longestMountain(int[] A) {
        int start=0,count=0;
        for(int i=0;i<A.length-1;i++)
        {
            start=i;
            while(i<A.length-1 && A[i]<A[i+1])
            {
                i++;
            }
            if(start==i)
                continue;
            if(i==(A.length-1))
                return count;
            int t=i;
            while(i<A.length-1 && A[i]>A[i+1])
               i++;  
            if(start!=i && t!=i)
            {count=Math.max(i-start+1,count);i--;}
        }
        return count;
    }
}