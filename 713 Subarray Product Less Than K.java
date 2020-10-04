class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int prod = 1;
        int count = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (nums[windowEnd] >= k) {
                windowStart = windowEnd + 1;
                prod = 1;
            } 
            else
            {
            prod *= nums[windowEnd];
            while (prod >= k) {
                prod = prod / nums[windowStart];
                windowStart++;
                
            }
count = count + windowEnd - windowStart + 1;
            }
            
        }

        return count;
    }
}