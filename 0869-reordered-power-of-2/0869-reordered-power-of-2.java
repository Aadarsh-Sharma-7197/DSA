class Solution {
    public String count(int n){
        int[] freq = new int[10];
        while(n!=0){
            freq[n%10]++;
            n/=10;
        }
        StringBuilder sb = new StringBuilder();
        for(int num:freq)
            sb.append(num).append("#");
        return sb.toString();
    }
    public boolean reorderedPowerOf2(int n) {
        String target = count(n);
        for(int i = 1; i < (int)1e9; i*=2){
            String str = count(i);
            if(str.equals(target))
                return true;
        }
        return false;
    }
}