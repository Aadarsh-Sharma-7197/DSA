class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first,-1);
        Arrays.fill(last,-1);
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(first[ch-'a'] == -1)
                first[ch-'a'] = i;
            ch = s.charAt(s.length() - 1 - i);
            if(last[ch-'a'] == -1)
                last[ch-'a'] = s.length() - 1 - i;
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(last[ch-'a'] - first[ch-'a'] - 1 != distance[ch-'a'])
                return false;
        }
        return true;
    }
}