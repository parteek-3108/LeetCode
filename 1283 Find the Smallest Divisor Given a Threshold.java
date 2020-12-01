class Solution {
    public boolean check(int nums[],int t,int threshhold)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count+=(nums[i]+t-1)/t;
        }
        if(count>threshhold)
                return false;
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        
int l=0;
      for(int i=0;i<nums.length;i++)
      {
          l=Math.max(nums[i],l);
      }
        int i=1;
        while(i<l)
        {
            int mid=(l+i)/2;
            if(check(nums,mid,threshold))
            {
                l=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;
    }
}