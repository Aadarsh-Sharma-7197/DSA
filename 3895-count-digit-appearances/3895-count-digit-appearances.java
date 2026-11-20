class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt = 0;
        for(int num:nums){
            int temp = num;
            while(temp != 0){
                if(temp % 10 == digit)
                    cnt++;
                temp /= 10;
            }
        }
        return cnt;
    }
}