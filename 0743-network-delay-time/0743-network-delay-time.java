class Solution {
    class Pair{
        int node,time;
        Pair(int node, int time){
            this.node = node;
            this.time = time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0 ; i <= n; i++)
            adj.add(new ArrayList<>());
        for(int[] time:times)
            adj.get(time[0]).add(new Pair(time[1],time[2]));
        int[] dist = new int[n+1];
        Arrays.fill(dist,(int)1e9);
        dist[k] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.time - b.time);
        pq.offer(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int node = p.node;
            int time = p.time;
            for(Pair it: adj.get(node)){
                int adjNode = it.node;
                int wt = it.time;
                if(time + wt < dist[adjNode]){
                    dist[adjNode] = time + wt;
                    pq.offer(new Pair(adjNode,dist[adjNode]));
                }
            }
        }
        int max = -1;
        for(int i = 1; i < dist.length; i++){
            if(dist[i] == (int)1e9)
                return -1;
            max = Math.max(dist[i],max);
        }
        return max;
    }
}