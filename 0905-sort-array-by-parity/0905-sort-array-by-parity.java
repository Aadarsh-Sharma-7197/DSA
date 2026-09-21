class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int k = 0;
        int[] ans = new int[nums.length];
        for(int num:nums){
            if(num%2 == 0)
                ans[k++] = num;
        }
        for(int num:nums){
            if(num%2 != 0)
                ans[k++] = num;
        }
        return ans;
    }
}