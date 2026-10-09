class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = 0;
                int top = Math.max(0,i-k);
                int bottom = Math.min(n-1,i+k);
                int left = Math.max(0,j-k);
                int right = Math.min(m-1,j+k);
                for(int x = top; x <= bottom; x++){
                    for(int y = left; y <= right; y++)
                        sum += mat[x][y]; 
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }
}