class Solution {
    public int minFlips(String target) {
        int cnt = 0;
        char flag = '0';
        for(char ch:target.toCharArray()){
            if(ch != flag){
                cnt++;
                if(flag == '0')
                    flag = '1';
                else
                    flag = '0';
            }
        }
        return cnt;
    }
}