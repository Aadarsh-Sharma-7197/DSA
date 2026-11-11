class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long cost = (long)Math.min(cost1+cost2,costBoth) * Math.min(need1,need2);
        if(need1 > need2)
            cost += (long)Math.min(costBoth,cost1) * (need1 - need2);
        else
            cost += (long)Math.min(costBoth,cost2) * (need2 - need1);
        return cost;
    }
}