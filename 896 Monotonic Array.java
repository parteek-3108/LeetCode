class Solution {
    public boolean isMonotonic(int[] A) {
        boolean inc=false,dec=false;
        int i=0;
        for( i=1;i<A.length;i++)
        {
            
            if(A[i]>A[i-1])
            {
                if(dec)
                    break;
                inc=true;
            }
            if(A[i]<A[i-1])
            {
               if(inc)
                    break;
                dec=true; 
            }
        }
        return i==A.length;
    }
}