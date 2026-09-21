class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] ans = new int[nums.length];
        for(int num:nums){
            if(num%2 == 0)
                ans[left++] = num;
            else
                ans[right--] = num;
        }
        return ans;
    }
}