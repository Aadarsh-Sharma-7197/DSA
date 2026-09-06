class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int cnt = 0;
        String str = s + s;
        for(int i = 0; i < n; i++){
            int score = 0;
            for(int j = i+1; j < i+n; j++){
                if(str.charAt(j) == str.charAt(j-1))
                    score++;
            }
            if(score == k)
                cnt++;
        }
        return cnt;
    }
}