class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] prev = new int[m];
        int[] cur = new int[m];
        for(int j = 0; j < m; j++)
            prev[j] = matrix[0][j];
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                int u = matrix[i][j] + prev[j];
                int ld = (int)1e9;
                int rd = (int)1e9;
                if(j > 0)
                    ld = matrix[i][j] + prev[j-1];
                if(j < m-1)
                    rd = matrix[i][j] + prev[j+1];
                cur[j] = Math.min(u,Math.min(ld,rd));
            }
            int[] temp = prev;
            prev = cur;
            cur = temp;
        }
        int ans = (int)1e9;
        for(int i = 0; i < m; i++)
            ans = Math.min(ans,prev[i]);
        return ans;
    }
}