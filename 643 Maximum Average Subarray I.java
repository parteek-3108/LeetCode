class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++)
        {
            max+=nums[i];
        }
       int sum=max;
        for(int i=k;i<nums.length;i++)
        {
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(sum,max);
        }
        return (max*1.0)/k;
    }
}