class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int[] account:accounts){
            int sum = 0;
            for(int val:account)
                sum += val;
            ans = Math.max(sum,ans); 
        }
        return ans;
    }
}