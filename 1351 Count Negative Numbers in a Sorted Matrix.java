class Solution {
    public int countNegatives(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {
          int low=0,high=grid[i].length-1;
            int mid=high;
            while(low<=high && low<grid[i].length)
            {
              mid=(low+high)/2;
                if(grid[i][mid]<0)
                    high=mid-1;
                else  
                    low=mid+1;
            }
            sum+=grid[i].length-low;
        }
        return sum;
    }
}