class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        String vowel = "aeiou";
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int max1 = 0;
        int max2 = 0;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(vowel.contains(ch+""))
                max1 = Math.max(max1,freq[ch-'a']);
            else
                max2 = Math.max(max2,freq[ch-'a']);
        }
        return max1 + max2;
    }
}