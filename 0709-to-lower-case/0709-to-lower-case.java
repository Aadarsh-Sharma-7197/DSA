class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch >= 65 && ch < 91)
                ch = (char)(ch + 32);
            ans.append(ch);
        }
        return ans.toString();
    }
}