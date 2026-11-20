class Solution {
    public int countTriples(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int num = (int)Math.sqrt(i * i + j * j);
                if(num * num == i * i + j * j && num <= n)
                    cnt++;
            }
        }
        return cnt;
    }
}