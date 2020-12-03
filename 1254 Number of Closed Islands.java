class Solution {
    public int closedIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0; 
        }
        int count = 0; 
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    if (isClosedIsland(grid, i, j)) {
                        count++; 
                    }
                }
            }
        }
        return count; 
    }
    
    private boolean isClosedIsland(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false; 
        }
        
        if (grid[i][j] > 0) return true; 
        grid[i][j] = 2;  // mark as visited, also surrounded by water
        
        boolean up = isClosedIsland(grid, i+1, j); 
        boolean down = isClosedIsland(grid, i-1, j); 
        boolean left = isClosedIsland(grid, i, j+1); 
        boolean right = isClosedIsland(grid, i, j-1); 
        
        return up && down && left && right; 
    }
}