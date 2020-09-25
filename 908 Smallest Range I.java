class Solution {
    public int smallestRangeI(int[] A, int K) {
        int min=100000,max=-1;
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
                max=A[i];
            if(A[i]<min)
                min=A[i];
        }
        int t=max-min-2*K;
        if(t<=0)
            return 0;
        return t;
    }
}