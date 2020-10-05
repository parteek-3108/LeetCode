class Solution {
    public boolean checkPossibility(int[] nums) {
        int check=0;
        for(int i=0;i<nums.length-1;i++)
        {

            
            if(nums[i]>nums[i+1])
            {
                if(check==1)
                    return false;
                // boolean x=nums[i]>nums[i+1];
                //  System.out.println(x);                      
                // System.out.println("pre "+nums[i]+" "+nums[i+1]+" "+i);

                //System.out.println("post "+nums[i]+" "+nums[i+1]+" "+i);
                else if(i>0 && nums[i-1]>nums[i+1])
                {
                    nums[i+1]=nums[i];
                }
                else
                    nums[i]=nums[i+1];
                check=1;
            }
        }
        return true;
    }
}