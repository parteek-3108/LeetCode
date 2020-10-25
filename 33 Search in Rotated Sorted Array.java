class Solution {
    private int binarySearch(int nums[],int l,int r,int t)
    {
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==t)
                return mid;
            else if(nums[mid]>t)
            {
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        if(nums[0]>nums[r])
        {
          while(l<=r)
          {
              int mid1=(l+r)/2;
              if(mid1<(nums.length-1) && nums[mid1]>nums[mid1+1])
              {
                  mid=mid1+1;
                  break;
              }
              else if(mid1>0 && nums[mid1]<nums[mid1-1])
              {
                  mid=mid1;
                  break;
              }
              else if(nums[mid1]>nums[0])
              {
                  l=mid1+1;
              }
              else
              {
                  r=mid1-1;
              }
          }
            
        }
        if(mid==0)
        {
            return binarySearch(nums,0,nums.length-1,target);
        }
    if(target>=nums[0])
    {
        return binarySearch(nums,0,mid-1,target);
    }
        return binarySearch(nums,mid,nums.length-1,target);
        
    }
}