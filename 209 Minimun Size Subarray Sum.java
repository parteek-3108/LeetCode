class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length==0)
            return 0;
        int sum=0;
       int left=0,right=0; 
        int max=Integer.MAX_VALUE;
        while(right<nums.length)
        {
            //System.out.println(left+" "+right+" "+max+" "+sum);
            if(right<nums.length && sum<s)
            {
                sum+=nums[right];
                right++;
                
            }
            if(sum>=s)
            {
            //     if(right<nums.length)
            // max=Math.min(right-left+1,max);
            //     else
                max=Math.min(right-left,max);
            }
            while(sum>=s && left<right)
            {
                //System.out.println(left+" "+right+" "+sum+" entered");
                sum-=nums[left];
 
                max=Math.min(right-left,max);
                left++;
            }
            
        }
        if(max==Integer.MAX_VALUE)
            return 0;
        return max;
    }
}