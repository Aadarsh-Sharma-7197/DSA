class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE; 
        for(int i = 0; i < n; i++){
            a = Math.max(nums[i],a);
            b = Math.min(nums[n-i-1],b);
            left[i] = a;
            right[n-i-1] = b; 
        }
        for(int i = 0; i < n; i++){
            if(left[i] - right[i] <= k)
                return i;
        }
        return -1;
    }
}