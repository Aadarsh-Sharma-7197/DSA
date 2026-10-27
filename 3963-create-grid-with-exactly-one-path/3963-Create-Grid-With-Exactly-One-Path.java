class Solution {
    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];
        for(int i = 0; i < m - 1; i++){
            grid[i][0] = '.';
            for(int j = 1; j < n; j++)
                grid[i][j] = '#';
        }
        for(int i = 0; i < n; i++){
            grid[m-1][i] = '.';
        }
        String[] ans = new String[m];
        int k = 0;
        for(char[] arr:grid)
            ans[k++] = new String(arr);
        return ans;
    }
}