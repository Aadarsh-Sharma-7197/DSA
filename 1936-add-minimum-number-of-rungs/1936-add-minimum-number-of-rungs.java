class Solution {
    public int addRungs(int[] rungs, int dist) {
        int cnt = 0;
        int prev = 0;
        for(int i = 0; i < rungs.length; i++){
            if(rungs[i] - prev > dist)
                cnt += (rungs[i] - prev - 1)/dist;
            prev = rungs[i];
        }
        return cnt;
    }
}