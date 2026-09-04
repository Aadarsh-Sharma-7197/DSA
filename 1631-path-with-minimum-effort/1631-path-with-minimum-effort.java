class Solution {
    class Pair{
        int dis,row,col;
        Pair(int dis, int row, int col){
            this.dis = dis;
            this.row = row;
            this.col = col;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int[][] dist = new int[n][m];
        for(int[] arr:dist)
            Arrays.fill(arr,Integer.MAX_VALUE);
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.dis - b.dis);
        dist[0][0] = 0;
        pq.offer(new Pair(0,0,0));
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int diff = p.dis;
            int r = p.row;
            int c = p.col;
            if(r == n-1 && c == m-1)
                return diff;
            for(int i = 0; i < 4; i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m){
                    int cur = Math.max(Math.abs(heights[r][c] - 
                    heights[nrow][ncol]),diff);
                    if(cur < dist[nrow][ncol]){
                        dist[nrow][ncol] = cur;
                        pq.offer(new Pair(cur,nrow,ncol));
                    }
                }
            }
        }
        return dist[n-1][m-1];
    }
}