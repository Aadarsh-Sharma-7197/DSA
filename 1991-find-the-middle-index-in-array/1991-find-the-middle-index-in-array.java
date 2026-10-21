class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 0;
        suffix[n-1] = 0;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
            suffix[n-i-1] = suffix[n-i] + nums[n-i];
        }
        for(int i = 0; i < n; i++)
            if(prefix[i] == suffix[i])
                return i;
        return -1;
    }
}