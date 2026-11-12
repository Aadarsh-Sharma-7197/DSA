class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans= 0;
        int n = nums.length;
        for(int i = 0 ; i < nums.length; i++){
            int cnt = 1;
            while(i < n - 1 && nums[i] < nums[i+1]){
                i++;
                cnt++;
            }
            ans = Math.max(cnt,ans);
        }
        for(int i = 0 ; i < nums.length; i++){
            int cnt = 1;
            while(i < n - 1 && nums[i] > nums[i+1]){
                i++;
                cnt++;
            }
            ans = Math.max(cnt,ans);
        }

        return ans;
    }
}