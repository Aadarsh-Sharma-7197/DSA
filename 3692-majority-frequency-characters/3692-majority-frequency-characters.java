class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int[] freq1 = new int[101];
        for(int i : freq){
            if(i != 0)
                freq1[i]++;
        }
        int index = 0;
        int cnt = 0;
        for(int i = 0; i < 101; i++){
            if(cnt <= freq1[i]){
                cnt = freq1[i];
                index = i;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(index == freq[i]){
                str.append((char)(i + 'a'));
            }
        }
        return str.toString();
    }
}