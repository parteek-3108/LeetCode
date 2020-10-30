class Solution {
    public void shift(int nums[],int i)
    {
        for(;i<nums.length-1;i++)
        {
            nums[i]=nums[i+1];
        }
    }
    public int removeElement(int[] nums, int val) {
        int num=nums.length;
        for(int i=0;i<num;i++)
        {
            if(nums[i]==val)
            {num--;shift(nums,i);i--;}
        }
        return num;
    }
}