class Solution {
    public int smallestIndex(int[] nums) {
        int ans = 1001;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int val = 0;
            while(temp!=0){
                val += temp%10;
                temp /= 10;
            }
            if(val == i)
                ans = Math.min(i,ans);
        }
        return ans == 1001? -1:ans;
    }
}