class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,one=0,two=0;
        int check=0;
        for(int i=0;i<nums.length;i++)
        {
           //System.out.println(" prev i "+ i+" one "+one+" two "+two+" check "+check);
            if(i>0 && nums[i]==nums[i-1] && nums[i]==0)
                {check=0;
                one=0;two=0;}
            if(nums[i]==1)
            {
                if(check==0)
                    one++;
                else 
                    two++;
                continue;}
            else
            {
              if(check==0)
              {
                  max=Math.max(one,max);
                  check=1;
              }
                else
                {
                    max=Math.max(one+two,max);
                    one=two;
                    two=0;
                }
            }
           // System.out.println("next i "+ i+" one "+one+" two "+two+" check "+check);
        }
        if(check==1)
            max=Math.max(one+two,max);
        else
            max=Math.max(one-1,max);
        return max;
    }
}