class Solution {
    public int minimizedStringLength(String s) {
        int[] freq = new int[26];
        for(char ch:s.toCharArray())
            freq[ch-'a']++;
        int cnt = 0;
        for(int i:freq)
            if(i != 0) cnt++;
        return cnt;
    }
}