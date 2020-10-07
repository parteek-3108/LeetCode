class Solution {
    private int find(int i,int j,int a[][],int b[][])
    { 
        if(i>=a.length || j>=a[0].length || a[i][j]==1)
            return 0;
        if(i==a.length-1 && j==a[i].length-1)
            return 1;
        
        if(b[i][j]!=-1)
            return b[i][j];
        b[i][j]=find(i+1,j,a,b)+find(i,j+1,a,b);
        return b[i][j];
        
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length==0)
            return 0;
        int a[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<a.length;i++)
            Arrays.fill(a[i],-1);
      return find(0,0,obstacleGrid,a);
    }
}