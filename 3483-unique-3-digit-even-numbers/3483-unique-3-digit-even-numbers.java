class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[1000];
        for(int digit:digits){
            freq[digit]++;
        }
        int ans = 0;
        for(int i = 100; i < 1000; i++){
            if(i%2!=0) continue;
            int a = i%10;
            int b = (i/10)%10;
            int c = (i/100)%10;
            freq[a]--;
            freq[b]--;
            freq[c]--;
            if(freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0){
                ans++;
            }
            freq[a]++;
            freq[b]++;
            freq[c]++;
        }
        return ans;
    }
}