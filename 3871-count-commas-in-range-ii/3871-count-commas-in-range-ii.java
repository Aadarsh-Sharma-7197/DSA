class Solution {
    public long countCommas(long n) {
        long start = 1000;
        int commas = 1;
        long cnt = 0;
        while (start <= n) {
            long end = Math.min(n, start * 1000 - 1);
            cnt += (end-start+1)*commas;
            start *= 1000;
            commas++;
        }
        return cnt;
    }
}