class Solution {
    public int maxChunksToSorted(int[] arr) {
        int dp[]=new int[arr.length];
        int max=arr[0];
        dp[0]=max;
        for(int i=1;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
            dp[i]=max;
        }
        int min=Integer.MAX_VALUE;
        int chunk=0;
        for(int i=dp.length-1;i>=0;i--)
        {
            min=Math.min(min,arr[i]);
            if(i==0 || min>=dp[i-1])
            {
                chunk++;
            }
           // System.out.println("i "+i+" min "+min+" chunk "+chunk+" dp "+dp[i]+" arr "+arr[i]);
        }
        return chunk;
    }
}