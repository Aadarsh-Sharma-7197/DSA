class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            String str = s.substring(i,n) + s.substring(0,i);
            int score = 0;
            for(int j = 1; j < n; j++){
                if(str.charAt(j) == str.charAt(j-1))
                    score++;
            }
            if(score == k)
                cnt++;
        }
        return cnt;
    }
}