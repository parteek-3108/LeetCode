class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[][] grid = new int[15][cells.length];
        
        for(int i = 0; i < cells.length; i++)
            grid[0][i] = cells[i];
        
        for(int row = 1; row < 15; row++) {
            for(int col = 1; col < cells.length - 1; col++) {
                if((grid[row - 1][col - 1] == 1 && grid[row - 1][col + 1] == 1) || (grid[row - 1][col - 1] == 0 && grid[row - 1][col + 1] == 0))
                    grid[row][col] = 1;
            }
        }
        if(N<14)
            return grid[N];
        return N%14 == 0 ? grid[14] : grid[N%14];
    }
}