class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] freq = new int[101];
        int cnt = 0;
        for(int num:nums)
            freq[num]++;
        for(int i = 0; i < 101; i++){
            if(freq[i] == 3){
                int[] grp = new int[3];
                int k = 0;
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == i)
                        grp[k++] = j;
                }
                if((grp[1] - grp[0]) == (grp[2] - grp[1]))
                    cnt++;
            }
        }
        return cnt;
    }
}