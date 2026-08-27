class Solution {
    public int path(int row,int col,int[][] grid,int[][] memo ){
        int n=grid.length-1;
        int m=grid[0].length-1;
        if(row==n+1 || col==m+1) return 0;
        if(grid[row][col]==1) return 0;
        if(row==n && col==m) return 1;
        if(memo[row][col]!=-1) return memo[row][col];
        
        return memo[row][col]=path(row+1,col,grid,memo)+path(row,col+1,grid,memo); 
    }
    public int uniquePaths(int[][] grid) {
       
        int n=grid.length;
        int m=grid[0].length;
        int[][] memo=new int[n][m];
        for(int[] row:memo) Arrays.fill(row,-1);
        return path(0,0,grid,memo);
        
    }
};