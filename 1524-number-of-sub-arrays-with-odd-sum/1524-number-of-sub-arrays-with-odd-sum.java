class Solution {
    public int numOfSubarrays(int[] arr) {
        long MOD = 1000000007;
        long cnt = 0;
        int odd = 0;
        int even = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum % 2 == 0){
                cnt += odd;
                even++;
            }
            else{
                cnt += even;
                odd++;
            }
        }
        return (int) (cnt % MOD);
    }
}