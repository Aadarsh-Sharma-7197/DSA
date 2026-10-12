class Solution {
    public int minOperations(String[] logs) {
        int cnt = 0;
        for(String str:logs){
            if(str.equals("../")){
                if(cnt > 0)
                    cnt--;
            }
            else if(str.equals("./")){}
            else{
                cnt++;
            }
        }
        return cnt;
    }
}