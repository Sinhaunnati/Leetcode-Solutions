import java.util.Arrays;

class Solution {
    int [][] dp;
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        dp = new int[n][m];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return func(n - 1, m - 1, grid);
    }

    int func(int i, int j, int[][] grid) {
        

        if(i == 0 && j == 0)
            return grid[0][0];

        if(i < 0 || j < 0)
            return 1000000000;

        if(dp[i][j]!=-1) return dp[i][j];

        int up = grid[i][j] + func(i - 1, j, grid);
        int left = grid[i][j] + func(i, j - 1, grid);

        return dp[i][j]=Math.min(up, left);
    }
}