class Solution {
    public int helper(int i, int j1, int j2, int r, int c, int[][] grid, int[][][] dp){
        if(j1 < 0 || j1 >= c || j2 < 0 || j2 >= c)
            return -(int)1e8;
        if(i == r-1){
            if(j1 == j2)
                return grid[i][j1];
            else
                return grid[i][j1] + grid[i][j2];
        }
        if(dp[i][j1][j2] != -1)
            return dp[i][j1][j2];
        int max = -(int)1e9;
        for(int dj1 = -1; dj1 <= +1; dj1++){
            for(int dj2 = -1; dj2 <= +1; dj2++){
                int val = 0;
                if(j1 == j2)
                    val = grid[i][j1];
                else
                    val = grid[i][j1] + grid[i][j2];
                val += helper(i+1,j1 + dj1,j2 + dj2,r,c,grid,dp);
                max = Math.max(max,val);
            }
        }
        return dp[i][j1][j2] = max;
    }
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] front = new int[m][m];
        int[][] cur = new int[m][m];
        for(int j1 = 0; j1 < m; j1++){
            for(int j2 = 0; j2 < m; j2++){
                if(j1 == j2)
                    front[j1][j2] = grid[n-1][j1];
                else
                    front[j1][j2] = grid[n-1][j1] + grid[n-1][j2];
            }
        }
        for(int i = n-2; i >= 0; i--){
            for(int j1 = 0; j1 < m; j1++){
                for(int j2 = 0; j2 < m; j2++){
                    int max = -(int)1e9;
                    for(int dj1 = -1; dj1 <= +1; dj1++){
                        for(int dj2 = -1; dj2 <= +1; dj2++){
                            int val = 0;
                            if(j1 == j2)
                                val = grid[i][j1];
                            else
                                val = grid[i][j1] + grid[i][j2];
                            if(j1 + dj1 >= 0 && j1 + dj1 < m && j2 + dj2 >= 0 && j2 + dj2 < m)
                                val += front[j1 + dj1][j2 + dj2];
                            else
                                val += -(int)1e9;
                            max = Math.max(max,val);
                        }
                    }
                    cur[j1][j2] = max;
                }
            }
            int[][] temp = front;
            front = cur;
            cur = temp;
        }
        return front[0][m-1];
    }
}