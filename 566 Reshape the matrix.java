class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int target=r*c;
        int check=0;
        if(nums.length>0)
            check=nums.length*nums[0].length;
        if(target!=check)
            return nums;
        int result[][]=new int[r][c];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                result[index/c][index%c]=nums[i][j];
                index++;
            }
        }
        return result;
    }
}