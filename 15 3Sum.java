class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        // sanity check
        if(nums == null || nums.length == 0) return ans;
        
        final int N = nums.length;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < N - 2; ++i){
            if(i > 0 && nums[i - 1] == nums[i]) continue;
            int lo = i + 1, hi = N - 1;
            
            int target = -nums[i];
            
            while(lo < hi){
                int sum = nums[lo] + nums[hi];
                if(sum == target){
                    ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                    
                    ++lo;
                    --hi;
                    
                    while(lo < hi && nums[lo - 1] == nums[lo]) ++lo;
                    while(lo < hi && nums[hi] == nums[hi + 1]) --hi;
                }else if(sum > target){
                    --hi;
                }else{
                    ++lo;
                }
            }
        }
        
        return ans;
    }
}
