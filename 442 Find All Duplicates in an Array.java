class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++) {
            int k = Math.abs(nums[i]) - 1;
            
            if(nums[k] < 0) {
                list.add(k + 1);
            } else {
                nums[k] = nums[k] * -1;
            }
        }
        
        return list;
    }
}