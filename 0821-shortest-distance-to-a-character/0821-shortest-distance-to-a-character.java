class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            int cnt = 0;
            while(left >= 0 || right <= s.length()){
                if(left >= 0 && s.charAt(left) == c){
                    ans[k++] = cnt;
                    break; 
                }
                else if(right < s.length() && s.charAt(right) == c){
                    ans[k++] = cnt;
                    break;
                }
                else{
                    left--;
                    right++;
                    cnt++;
                }
            }
        }
        return ans;
    }
}