class Solution {
    public String stringHash(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i <= s.length()-k; i++){
            int sum = 0;
            for(int j = i; j < i+k; j++){
                sum += s.charAt(j)-'a';
            }
            sum = sum % 26;
            ans.append((char)(sum+'a'));
            i += (k-1);
        }
        return ans.toString();
    }
}