class Solution {
    public boolean search(int[] nums, int target) {
        int i=0;
        while(i<nums.length && nums[i]<=target)
        {
            if(nums[i]==target)
                return true;
            i++;
        }
        i=nums.length-1;
        while(i>=0 && nums[i]>=target )
        {
            if(nums[i]==target)
                return true;
            i--;
        }  
        return false;
    }
}