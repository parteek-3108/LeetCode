class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        permute(nums, 0);
        
        return res;
    }
    
    public void permute(int[] nums, int start) {
        if (start == nums.length - 1) {
            List<Integer> sub = new ArrayList<Integer>();
            
            for (int i : nums) {
                sub.add(i);
            }
            res.add(sub);
            
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            if (i != start && !availableForPermute(nums, start, i)) continue; 
            
            swap(nums, start, i);
            permute(nums, start + 1);
            swap(nums, start, i);
        }
    }
    
    private boolean availableForPermute(int[] nums, int start, int chosen) {
        for (int i = start; i < chosen; i++) {
            if (nums[i] == nums[chosen]) {
                return false;
            }
        }
        
        return true;
    }
    
    private void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}