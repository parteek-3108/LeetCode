class Solution {
    public int specialArray(int[] nums) {
    Arrays.sort(nums);
        int len = nums.length;
        
        for(int i=0;i<len;i++){
            
            int rem = len-i;
            
            if(rem<=nums[i]){
                
                if(i>0 && rem>nums[i-1]){
                    return rem;
                }else if(i==0){
                    return rem;
                }
                
            }
        }
        
        return -1;
    }
}