class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < tickets.length; i++)
            q.add(i);
        while(!q.isEmpty()){
            time++;
            int ele = q.poll();
            tickets[ele]--;
            if(ele == k && tickets[ele] == 0)
                return time;
            if(tickets[ele] > 0)
                q.add(ele);
        }
        return time;
    }
}