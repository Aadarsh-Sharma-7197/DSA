class Solution {
    class Pair{
        int node,wt;
        Pair(int node,int wt){
            this.node = node;
            this.wt = wt;
        }
    }
    class Tuple{
        int stops,node,cost;
        Tuple(int stops,int node,int cost){
            this.stops = stops;
            this.node = node;
            this.cost = cost;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for(int[] flight:flights)
            adj.get(flight[0]).add(new Pair(flight[1],flight[2]));
        int[] dist = new int[n];
        Arrays.fill(dist,(int)1e9);
        dist[src] = 0;
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(0,src,0));
        while(!q.isEmpty()){
            Tuple t = q.poll();
            int stops = t.stops;
            int node = t.node;
            int cost = t.cost;
            if(stops > k)
                break;
            for(Pair p:adj.get(node)){
                int adjNode = p.node;
                int edwt = p.wt;
                if(cost + edwt < dist[adjNode]){
                    dist[adjNode] = cost + edwt;
                    q.offer(new Tuple(stops+1,adjNode,dist[adjNode]));
                }
            }
        }
        return dist[dst] == (int)1e9 ? -1:dist[dst];
    }
}