class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max = new int[n];
        int[] min = new int[n];
        int mx = Integer.MIN_VALUE;
        int sm = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            mx = Math.max(mx,nums[i]);
            sm = Math.min(sm,nums[n-i-1]);
            max[i] = mx;
            min[n-i-1] = sm;
        }
        for(int i = 0; i < n; i++){
            if(max[i] - min[i] <= k)
                return i;
        }
        return -1;
    }
}