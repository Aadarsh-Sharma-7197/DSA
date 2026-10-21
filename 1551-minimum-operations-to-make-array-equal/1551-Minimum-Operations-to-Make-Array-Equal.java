class Solution {
    public int minOperations(int n) {
        int ans = 0;
        for(int i = 0; i < n/2; i++){
            int num1 = 2*i + 1;
            int num2 = 2*(n-i-1) + 1;
            ans += (num2 - num1) / 2;
        }
        return ans;
    }
}