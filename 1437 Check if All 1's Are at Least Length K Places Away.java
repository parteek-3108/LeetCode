class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int t=k;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                t++;
            else
            {
                if(t<k)
                    return false;
                t=0;
            }
        }
        return true;
        
    }
}