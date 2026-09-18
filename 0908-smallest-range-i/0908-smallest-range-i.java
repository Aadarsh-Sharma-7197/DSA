class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        if(max - min <= k*2)
            return 0;
        return (max - min) - 2*k;
    }
}