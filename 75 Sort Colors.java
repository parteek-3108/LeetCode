class Solution {
    public void sortColors(int[] nums) {
       int zero=-1,one=-1,two=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==2)
            {
                two=i;
                continue;
            }
            else if(nums[i]==1)
            {
                nums[i]=2;
                one++;
                nums[one]=1;
            }
            else 
            {
                nums[i]=2;
                one++;
                nums[one]=1;
                zero++;
                nums[zero]=0;
            }
        }
    }
}