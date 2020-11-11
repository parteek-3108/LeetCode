class Solution {
    public int numIdenticalPairs(int[] nums) {
      Arrays.sort(nums);
        int count=0;
        int sum=0;
        if(nums.length<=1)
            return 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {count++;
                continue;
                
            }
            else
            {
                sum+=((count)*(count+1))/2;
                count=0;
            }
        }
        if(nums[nums.length-1]==nums[nums.length-2])
            sum+=((count)*(count+1))/2;
        return sum;
    }
}