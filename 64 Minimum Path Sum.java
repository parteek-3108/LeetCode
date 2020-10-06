class Solution {
    int store[][];
    private int find(int grid[][],int i,int j,int sum)
    {
        
        if(i>grid.length-1 || j>grid[0].length-1)
            return 1000000000;
        //System.out.println("prev i "+i+" j "+j+" store "+store[i][j]+" sum "+sum);
        if(i==grid.length-1 && j==grid[0].length-1)
        {          
            return grid[i][j];
        }
        if(store[i][j]==-1)
        {
        int d=find(grid,i+1,j,sum+grid[i][j]);
            int r=find(grid,i,j+1,sum+grid[i][j]);
            store[i][j]=Math.min(d+grid[i][j],r+grid[i][j]);
        }
        //System.out.println("next i "+i+" j "+j+" store "+store[i][j]+" sum "+sum);
        return store[i][j];
    }
    public int minPathSum(int[][] grid) {
        if(grid.length==0)
            return 0;
        store=new int[grid.length][grid[0].length];
        for(int i=0;i<store.length;i++)
        {
            for(int j=0;j<store[0].length;j++)
            {
                store[i][j]=-1;
            }
        }
         int t=find(grid,0,0,0);
        if(store[0][0]==-1)
            return t;
        return store[0][0];
    }
}