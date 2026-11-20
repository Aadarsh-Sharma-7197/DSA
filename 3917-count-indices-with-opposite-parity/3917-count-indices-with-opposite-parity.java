class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int odd = 0;
        int even = 0;
        for(int i = n-1; i >= 0; i--){
            if(nums[i] % 2 == 0){
                nums[i] = odd;
                even++;
            }
            else{
                nums[i] = even;
                odd++;
            }
        }
        return nums;
    }
}