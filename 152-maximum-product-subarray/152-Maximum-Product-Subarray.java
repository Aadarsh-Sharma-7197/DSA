class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            int cur = nums[i];
            int newMax = Math.max(cur,Math.max(cur*max,cur*min));
            int newMin = Math.min(cur,Math.min(cur*max,cur*min));
            max = newMax;
            min = newMin;
            ans = Math.max(ans,max);
        }
        return ans;
    }
}