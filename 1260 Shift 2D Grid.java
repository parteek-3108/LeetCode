class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List <List<Integer>> list=new ArrayList<List<Integer>>();
        if(grid.length==0)
            return list;
     int max=grid.length*grid[0].length-1;   
        int l=0;
        while(l<max)
        {
            int t=grid[l/grid[0].length][l%grid[0].length];
          grid[l/grid[0].length][l%grid[0].length]=grid[max/grid[0].length][max%grid[0].length];
            grid[max/grid[0].length][max%grid[0].length]=t;
            l++;
            max--;
            
        }
        k=k%(grid.length*grid[0].length);
        max=k-1;
        l=0;
         while(l<max)
        {
            int t=grid[l/grid[0].length][l%grid[0].length];
          grid[l/grid[0].length][l%grid[0].length]=grid[max/grid[0].length][max%grid[0].length];
            grid[max/grid[0].length][max%grid[0].length]=t;
            l++;
            max--;
        }
        l=k;
        max=grid.length*grid[0].length-1;
        while(l<max)
        {
            int t=grid[l/grid[0].length][l%grid[0].length];
          grid[l/grid[0].length][l%grid[0].length]=grid[max/grid[0].length][max%grid[0].length];
            grid[max/grid[0].length][max%grid[0].length]=t;
            l++;
            max--;
            
        }
        for(int i=0;i<grid.length;i++)
        {
            list.add(new ArrayList<Integer>());
            for(int j=0;j<grid[i].length;j++)
                list.get(i).add(grid[i][j]);
        }
        return list;
        
    }
}