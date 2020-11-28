class Solution {
    public int[] decompressRLElist(int[] nums) {

         int finalSize = 0;
        for (int i=0; i<nums.length; i+=2) 
            finalSize += nums[i];
        int [] result = new int [finalSize];
        int index = 0;
        for (int i=0; i<nums.length; i+=2) {
            Arrays.fill(result, index, index+nums[i], nums[i+1]);
            index += nums[i];
        }
        return result;
    }
}