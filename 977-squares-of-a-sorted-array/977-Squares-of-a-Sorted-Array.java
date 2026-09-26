class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if(leftsq > rightsq){
                ans[i] = leftsq;
                left++;
            }
            else{
                ans[i] = rightsq;
                right--;
            }
        }
        return ans;
    }
}