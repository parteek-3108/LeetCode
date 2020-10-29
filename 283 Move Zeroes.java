class Solution {
    public void moveZeroes(int[] nums) {
      int zero=0;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==0)
               continue;
            else
            {
                int t=nums[i];
                nums[i]=nums[zero];
                nums[zero]=t;
                zero++;
            }
        }
    }
}