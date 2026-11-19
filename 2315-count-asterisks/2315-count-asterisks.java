class Solution {
    public int countAsterisks(String s) {
        int cnt = 0;
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == '|'){   
                if(cnt == 1)
                    cnt--;
                else
                    cnt++;
            }   
            if(cnt == 0 && ch == '*')
                ans++;
        }
        return ans;
    }
}