
class Solution {
private int binarysearch(int []A,long k,int l)
{
    int r=A.length-1;
    while(l<=r)
    {
        int mid=(l+r)/2;
        if(A[mid]==k)
            return mid;
        else if(A[mid]>k)
        {
            r=mid-1;
        }
        else 
            l=mid+1;
    }
    return -1;
}
    public int lenLongestFibSubseq(int[] A) {
        if(A.length<=2)
            return 0;
        int max=0;
        //System.out.println(dp.length);
        for(int i=0;i<A.length-2;i++)
        {
            long a=A[i];
            
            for(int j=i+1;j<A.length-1;j++)
            {
                a=A[i];
                long b=A[j];
                int count=0;
                int res=binarysearch(A,a+b,0);
                // System.out.println(" i "+i+" j "+j+" max "+max+" a+b "+(a+b)+" a "+a+" b "+b +" "+A[i]+" "+A[j]);
             while((a+b)<=(A[A.length-1]) && res!=-1)
             {
                 // System.out.println("a prev"+a+" b "+b);
                 b=a+b;
                 a=b-a;
                 // System.out.println("a next"+a+" b "+b+" a+b "+(a+b));
                 //System.out.println(dp[a+b]);
                 if(count==0)
                     count=2;
                 count++;
                 res=binarysearch(A,a+b,res);
             }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}