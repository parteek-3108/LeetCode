class Solution {
    public int findMin(int[] nums) {
        int i=1;
        for(;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
                break;
            //System.out.println(nums[i]+" "+nums[i-1]);
        }
        if(i==nums.length)
            return nums[0];
        return nums[i];
    }
}