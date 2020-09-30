class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
      int j=0,i=0,p=0,ans=0;
        for(;i<A.length;i++)
        {
            if(A[i]>=L && A[i]<=R)
            {
                p=i-j+1;
                ans+=i-j+1;
            }
            else if(A[i]<L)
            {
                ans+=p;
            }
            else
            {
                p=0;
                j=i+1;
            }
        }
        return ans;
    }
}