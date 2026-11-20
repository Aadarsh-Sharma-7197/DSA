class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums)
            freq[num]++;
        int max = 0;
        for(int val : freq)
            max = Math.max(val,max);
        int cnt = 0;
        for(int val : freq)
            if(val == max)
                cnt += val;
        return cnt;
    }
}