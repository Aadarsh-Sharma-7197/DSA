class Solution {
    public int maximum69Number (int num) {
        int n = (int)Math.log10(num) + 1;
        int[] digits = new int[n];
        int k = 0;
        int max = num;
        while(num!=0){
            digits[k++] = num%10;
            num /= 10;
        }
        for(int i = 0; i < digits.length; i++){
            if(digits[i] == 6)
                digits[i] = 9;
            else
                digits[i] = 6;
            int val = 0;
            for(int j = digits.length-1; j >= 0; j--){
                val = val*10 + digits[j];
            }
            max = Math.max(max,val);
            if(digits[i] == 6)
                digits[i] = 9;
            else
                digits[i] = 6;
        }
        return max;
    }
}