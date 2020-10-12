class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1)
            return true;
        int jump=nums[0];
        if(jump==0)
            return false;
        int i=0;
        while( i<(nums.length-1))
        {
            jump=Math.max(nums[i],jump-1);
            if(jump==0)
                break;
            i++;
        }
        if(i==(nums.length-1))
            return true;
        return false;
        
    }
}