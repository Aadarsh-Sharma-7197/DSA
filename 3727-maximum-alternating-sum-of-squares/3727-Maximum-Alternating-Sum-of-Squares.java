class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0)
                nums[i] = -nums[i];
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        long sum = 0;
        while(left < right){
            sum += nums[right] * nums[right] - nums[left] * nums[left];
            left++;
            right--;
        }
        if(left == right)
            sum += nums[left] * nums[left];
        return sum;
    }
}