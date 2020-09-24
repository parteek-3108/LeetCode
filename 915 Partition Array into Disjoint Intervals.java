class Solution {
    public int partitionDisjoint(int[] A) {
        int length=A.length;
        int max=A[0];
        int res[]=new int[A.length];
        res[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            max=Math.max(max,A[i]);
            res[i]=max;
        }
        int min=A[A.length-1];
        for(int i=A.length-2;i>=0;i--)
        {
            if(res[i]<=min)
            {
                length=i+1;
            }
            min=Math.min(min,A[i]);
        }
        return length;
    }
}