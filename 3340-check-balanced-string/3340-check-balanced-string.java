class Solution {
    public boolean isBalanced(String num) {
        int a = 0;
        int b = 0;
        for(int i = 0; i < num.length(); i++){
            int val = num.charAt(i) - '0';
            if(i % 2 == 0)
                a += val;
            else
                b += val; 
        }
        return a == b;
    }
}