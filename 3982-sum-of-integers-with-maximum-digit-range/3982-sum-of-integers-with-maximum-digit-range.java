class Solution {
    public int maxDigitRange(int[] nums) {
        int[] range = new int[nums.length];
        int maxRange = 0;
        int k = 0;
        for(int num:nums){
            int min = 9;
            int max = 0;
            while(num!=0){
                min = Math.min(min,num%10);
                max = Math.max(max,num%10);
                num /= 10;
            }
            range[k++] = max-min;
            maxRange = Math.max(maxRange,max-min);
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(range[i] == maxRange)
                ans += nums[i];
        }
        return ans;
    }
}