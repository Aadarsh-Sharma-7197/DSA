class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int[] arr:dp)
            Arrays.fill(arr,-1);
        for(int j = 0; j < m; j++)
            dp[0][j] = matrix[0][j];
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                int u = matrix[i][j] + dp[i-1][j];
                int ld = (int)1e9;
                int rd = (int)1e9;
                if(j > 0)
                    ld = matrix[i][j] + dp[i-1][j-1];
                if(j < m-1)
                    rd = matrix[i][j] + dp[i-1][j+1];
                dp[i][j] = Math.min(u,Math.min(ld,rd));
            }
        }
        int ans = (int)1e9;
        for(int i = 0; i < m; i++)
            ans = Math.min(ans,dp[n-1][i]);
        return ans;
    }
}