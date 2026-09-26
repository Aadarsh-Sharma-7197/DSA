class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int cnt = 1;
        List<Integer> list = new ArrayList<>();
        int x = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1])
                cnt++;
            else
                cnt = 1;
            if(cnt > k){
                while(i < nums.length && nums[i] == nums[i-1])
                    i++;
                cnt = 1;
            }
            if(i < nums.length)
                nums[x++] = nums[i];
        }
        return Arrays.copyOf(nums,x);
    }
}