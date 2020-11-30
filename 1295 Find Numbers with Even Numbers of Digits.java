class Solution {
    public int findNumbers(int[] nums) {
      Arrays.sort(nums);
        int i=0,count=0,digit=0,div=1;
        for(;i<nums.length;i++)
        {
            while(nums[i]/div!=0)
            {
                div*=10;
                digit++;
            }
            if(digit%2==0)
                count++;
        }
        return count;
    }
}