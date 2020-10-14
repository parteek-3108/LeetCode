class Solution {
    public int maxSubArray(int[] nums) {
        int count=0;
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
                max=nums[i];
          if((sum+nums[i])>=nums[i])
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
            }
            if(sum>max)
                max=sum;
        }
        return max;
      
    }
}