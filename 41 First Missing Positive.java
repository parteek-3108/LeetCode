class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]>0 && nums[i]!=i+1 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1])
            {
              int t=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[t-1]=t;
                i--;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
             return i+1;
            }
        }
        return i+1;
        
    }
}