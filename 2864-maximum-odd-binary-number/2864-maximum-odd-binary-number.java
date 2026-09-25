class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int zeroes = 0;
        for(char ch:s.toCharArray()){
            if(ch == '1') ones++;
            else zeroes++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 1; i < ones; i++)
            ans.append("1");
        for(int i = 0; i < zeroes; i++)
            ans.append("0");
        ans.append("1");
        return ans.toString();
    }
}