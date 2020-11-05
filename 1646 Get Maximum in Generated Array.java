class Solution {
    public int getMaximumGenerated(int n) {
        if(n<=1)
            return n;
       int a[]=new int[n+1];
        a[0]=0;
        int max=0;
        a[1]=1;
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                a[i]=a[i/2];
            }
            else
                a[i]=a[i/2]+a[i/2+1];
            max=Math.max(a[i],max);
        }
        return max;
    }
}