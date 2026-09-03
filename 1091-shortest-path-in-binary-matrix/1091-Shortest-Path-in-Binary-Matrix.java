class Solution {
    class Pair{
        int dis;
        int row;
        int col;
        Pair(int dis,int row,int col){
            this.dis = dis;
            this.row = row;
            this.col = col;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;
        if(n == 1)
            return 1;
        int[][] dist = new int[n][n];
        for(int[] arr:dist)
            Arrays.fill(arr,(int)1e9);
        dist[0][0] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1,0,0));
        int[] drow = {-1,0,1,0,1,-1,-1, 1};
        int[] dcol = {0,1,0,-1,1,-1, 1,-1};
        while(!q.isEmpty()){
            Pair p = q.poll();
            int curDist = p.dis;
            int r = p.row;
            int c = p.col;
            for(int i=0;i<8;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < n && 
                grid[nrow][ncol] == 0 && curDist + 1 < dist[nrow][ncol]){
                    dist[nrow][ncol] = curDist + 1;
                    if(nrow == n-1 && ncol == n-1)
                        return curDist + 1;
                    q.offer(new Pair(curDist + 1,nrow,ncol));
                }
            }
        }   
        return -1;
    }
}